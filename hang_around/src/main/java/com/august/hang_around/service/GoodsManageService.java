package com.august.hang_around.service;

import com.august.hang_around.domain.*;
import com.august.hang_around.exception.BusinessException;
import com.august.hang_around.exception.BusinessExceptionCode;
import com.august.hang_around.mapper.GoodsInfoMapper;
import com.august.hang_around.mapper.UGoodsMapper;
import com.august.hang_around.req.*;
import com.august.hang_around.resp.GoodsManageResp;
import com.august.hang_around.resp.GoodsSearchResp;
import com.august.hang_around.resp.PageResp;
import com.august.hang_around.util.CopyUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 战神
 */
@Service
public class GoodsManageService {
    private static final Logger LOG = LoggerFactory.getLogger(GoodsManageService.class);
    @Resource
    private UGoodsMapper uGoodsMapper;
    @Resource
    private GoodsInfoMapper goodsInfoMapper;

    /**
     * 添加商品
     *
     * @param req
     */
    public void addOwnGood(GoodsManageInsertReq req) {
        UGoodsExample uGoodsExample = new UGoodsExample();
        UGoodsExample.Criteria criteria = uGoodsExample.createCriteria();
        criteria.andGidEqualTo(req.getUid());
        UGoods uGoods = CopyUtil.copy(req, UGoods.class);
        uGoodsMapper.insertSelective(uGoods);
    }

    /**
     * 插入图片
     *
     * @param req
     */
    public void uploadImg(GoodsUploadReq req) {
        GoodsInfo goodsInfo = CopyUtil.copy(req, GoodsInfo.class);
        goodsInfoMapper.insertSelective(goodsInfo);
    }

    /**
     * 搜索用户的商品
     *
     * @param req
     * @return
     */
    public PageResp<GoodsManageResp> searchOwnGoods(GoodsManageReq req) {
        UGoodsExample uGoodsExample = new UGoodsExample();
        UGoodsExample.Criteria criteria = uGoodsExample.createCriteria();
        criteria.andUidEqualTo(req.getUid());
        criteria.andGnameLike("%" + req.getQuery() + "%");
        PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<UGoods> uGoodsList = uGoodsMapper.selectByExampleWithBLOBs(uGoodsExample);
        PageInfo<UGoods> pageInfo = new PageInfo<>(uGoodsList);
        List<GoodsManageResp> list = CopyUtil.copyList(uGoodsList, GoodsManageResp.class);
        PageResp<GoodsManageResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);
        return pageResp;

    }

    /**
     * 删除商品
     *
     * @param req
     */
    public void deleteGood(GoodsManageReq req) {
        uGoodsMapper.deleteByPrimaryKey(req.getGid());
    }

    /**
     * 保存编辑
     *
     * @param req
     */
    public void saveGood(GoodsManageSaveReq req) {
        UGoodsExample uGoodsExample = new UGoodsExample();
        UGoodsExample.Criteria criteria = uGoodsExample.createCriteria();
        criteria.andGidEqualTo(req.getGid());
        UGoods uGoods = CopyUtil.copy(req, UGoods.class);
        uGoodsMapper.updateByExampleSelective(uGoods, uGoodsExample);
    }

    /**
     * 根据用户id查询单个商品
     */
    public GoodsManageResp getOneGood(GoodsManageReq req) {
        UGoods uGoods = uGoodsMapper.selectByPrimaryKey(req.getGid());
        GoodsManageResp list = CopyUtil.copy(uGoods, GoodsManageResp.class);
        return list;
    }

    /**
     * 根据用户id分页查询商品
     */
    public PageResp<GoodsManageResp> getOwnGoods(GoodsManageReq req) {
        UGoodsExample uGoodsExample = new UGoodsExample();
        UGoodsExample.Criteria criteria = uGoodsExample.createCriteria();
        criteria.andUidEqualTo(req.getUid());
        PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<UGoods> uGoodsList = uGoodsMapper.selectByExampleWithBLOBs(uGoodsExample);
        PageInfo<UGoods> pageInfo = new PageInfo<>(uGoodsList);
        List<GoodsManageResp> list = CopyUtil.copyList(uGoodsList, GoodsManageResp.class);
        PageResp<GoodsManageResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);
        return pageResp;

    }

}
