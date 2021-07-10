package com.august.hang_around.service;
import com.august.hang_around.domain.GoodsInfo;
import com.august.hang_around.domain.GoodsInfoExample;
import com.august.hang_around.mapper.GoodsInfoMapper;
import com.august.hang_around.req.GoodsInfoReq;
import com.august.hang_around.req.PageReq;
import com.august.hang_around.resp.GoodsInfoResp;
import com.august.hang_around.resp.GoodsSearchResp;
import com.august.hang_around.resp.PageResp;
import com.august.hang_around.util.CopyUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 战神
 */
@Service
public class GoodsService {
    private static final Logger LOG = LoggerFactory.getLogger(GoodsService.class);
    @Resource
    private GoodsInfoMapper goodsInfoMapper;
/**
 * 根据id查询商品
 */
public GoodsInfoResp goGoodsInfo(GoodsInfoReq req){
    GoodsInfo goodsInfo = goodsInfoMapper.selectByPrimaryKey(req.getId());
    GoodsInfoResp goodsInfoResp = CopyUtil.copy(goodsInfo, GoodsInfoResp.class);
    return goodsInfoResp;
}
    /**
     * 搜索商品
     * @param req
     * @return
     */
    public PageResp<GoodsSearchResp> searchGoodsInfo(PageReq req){
        GoodsInfoExample goodsInfoExample = new GoodsInfoExample();
        GoodsInfoExample.Criteria criteria = goodsInfoExample.createCriteria();
        criteria.andNameLike("%"+req.getQuery()+"%");
        PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<GoodsInfo> goodsList = goodsInfoMapper.selectByExample(goodsInfoExample);
        PageInfo<GoodsInfo> pageInfo = new PageInfo<>(goodsList);
        //列表复制
        List<GoodsSearchResp> goodsInfoList = CopyUtil.copyList(goodsList, GoodsSearchResp.class);
        PageResp<GoodsSearchResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(goodsInfoList);
        return pageResp;
    }
    /**
     * 获取商品的全部信息方法
     * @param req
     * @return
     */
    public PageResp<GoodsInfoResp> getGoodsInfo(PageReq req){
        PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<GoodsInfo> goodsList = goodsInfoMapper.selectByExample(null);
        PageInfo<GoodsInfo> pageInfo = new PageInfo<>(goodsList);

        LOG.info("总页数: {}",pageInfo.getPages());
        //列表复制
        List<GoodsInfoResp> goodsInfoList = CopyUtil.copyList(goodsList, GoodsInfoResp.class);
        PageResp<GoodsInfoResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(goodsInfoList);
        return pageResp;
    }
}
