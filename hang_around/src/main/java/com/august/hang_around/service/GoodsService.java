package com.august.hang_around.service;

import com.august.hang_around.domain.GoodsCollection;
import com.august.hang_around.domain.GoodsCollectionExample;
import com.august.hang_around.domain.GoodsInfo;
import com.august.hang_around.domain.GoodsInfoExample;
import com.august.hang_around.mapper.GoodsCollectionMapper;
import com.august.hang_around.mapper.GoodsInfoMapper;
import com.august.hang_around.req.GoodsCollectionReq;
import com.august.hang_around.req.GoodsInfoReq;
import com.august.hang_around.req.GoodsManageReq;
import com.august.hang_around.req.PageReq;
import com.august.hang_around.resp.*;
import com.august.hang_around.util.CopyUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
    @Resource
    private GoodsCollectionMapper goodsCollectionMapper;

    /**
     * 删除收藏
     */
    public void deleteCollection(String id) {
        goodsCollectionMapper.deleteByPrimaryKey(id);
    }

    /**
     * 获取商品的收藏方法
     *
     * @param req
     * @return
     */
    public PageResp<GoodsCollectionResp> getGoodsCollection(GoodsCollectionReq req) {
        GoodsCollectionExample goodsCollectionExample = new GoodsCollectionExample();
        GoodsCollectionExample.Criteria criteria = goodsCollectionExample.createCriteria();
        criteria.andUidEqualTo(req.getUid());
        PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<GoodsCollection> goodsCollectionList = goodsCollectionMapper.selectByExampleWithBLOBs(goodsCollectionExample);
        PageInfo<GoodsCollection> pageInfo = new PageInfo<>(goodsCollectionList);

        LOG.info("总页数: {}", pageInfo.getPages());
        //列表复制
        List<GoodsCollectionResp> goodsCollectList = CopyUtil.copyList(goodsCollectionList, GoodsCollectionResp.class);
        PageResp<GoodsCollectionResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(goodsCollectList);
        return pageResp;
    }

    /**
     * 搜索商品的收藏
     *
     * @param req
     * @return
     */
    public PageResp<GoodsCollectionResp> searchCollection(PageReq req) {
        GoodsCollectionExample goodsCollectionExample = new GoodsCollectionExample();
        GoodsCollectionExample.Criteria criteria = goodsCollectionExample.createCriteria();
        criteria.andNameLike("%" + req.getQuery() + "%");
        PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<GoodsCollection> goodsCollectionList = goodsCollectionMapper.selectByExampleWithBLOBs(goodsCollectionExample);
        PageInfo<GoodsCollection> pageInfo = new PageInfo<>(goodsCollectionList);
        LOG.info("总页数: {}", pageInfo.getPages());
        //列表复制
        List<GoodsCollectionResp> goodsCollectList = CopyUtil.copyList(goodsCollectionList, GoodsCollectionResp.class);
        PageResp<GoodsCollectionResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(goodsCollectList);
        return pageResp;
    }

    /**
     * 收藏商品
     */
    public void collectionGoods(GoodsCollectionReq req) {
        System.out.println(req);
        GoodsCollection goodsCollection = CopyUtil.copy(req, GoodsCollection.class);
        System.out.println(goodsCollection);
        goodsCollectionMapper.insertSelective(goodsCollection);
    }

    /**
     * 根据id查询商品
     */
    public GoodsInfoResp goGoodsInfo(GoodsInfoReq req) {
        GoodsInfo goodsInfo = goodsInfoMapper.selectByPrimaryKey(req.getId());
        GoodsInfoResp goodsInfoResp = CopyUtil.copy(goodsInfo, GoodsInfoResp.class);
        return goodsInfoResp;
    }

    /**
     * 搜索商品
     *
     * @param req
     * @return
     */
    public PageResp<GoodsSearchResp> searchGoodsInfo(PageReq req) {
        GoodsInfoExample goodsInfoExample = new GoodsInfoExample();
        GoodsInfoExample.Criteria criteria = goodsInfoExample.createCriteria();
        criteria.andNameLike("%" + req.getQuery() + "%");
        PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<GoodsInfo> goodsList = goodsInfoMapper.selectByExampleWithBLOBs(goodsInfoExample);
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
     *
     * @param req
     * @return
     */
    public PageResp<GoodsInfoResp> getGoodsInfo(PageReq req) {
        PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<GoodsInfo> goodsList = goodsInfoMapper.selectByExampleWithBLOBs(null);
        PageInfo<GoodsInfo> pageInfo = new PageInfo<>(goodsList);

        LOG.info("总页数: {}", pageInfo.getPages());
        //列表复制
        List<GoodsInfoResp> goodsInfoList = CopyUtil.copyList(goodsList, GoodsInfoResp.class);
        PageResp<GoodsInfoResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(goodsInfoList);
        System.out.println(goodsList);
        return pageResp;
    }
}
