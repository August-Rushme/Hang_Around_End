package com.august.hang_around.controller;

import com.august.hang_around.domain.GoodsCollection;
import com.august.hang_around.req.GoodsCollectionReq;
import com.august.hang_around.req.GoodsInfoReq;
import com.august.hang_around.req.GoodsManageInsertReq;
import com.august.hang_around.req.PageReq;
import com.august.hang_around.resp.*;
import com.august.hang_around.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @author 战神
 * 关于商品信息的接口
 */
@RestController
@RequestMapping("/api/v1/goods")
public class GoodsController {
    private static final Logger LOG = LoggerFactory.getLogger(GoodsController.class);
    @Resource
    private GoodsService goodsService;
    /**
     * 删除收藏
     *
     * @param id
     * @return
     */
    @DeleteMapping("/collection/delete/{id}")
    public CommonResp deleteCollection(@PathVariable String id) {
        CommonResp resp = new CommonResp<>();
        goodsService.deleteCollection(id);
        resp.setMessage("删除成功");
        return resp;
    }

    /**
     * 搜索自己的收藏
     *
     * @param req
     * @return
     */
    @GetMapping("/collection/search")
    public CommonResp searchCollection(PageReq req) {
        /**
         * CommonResp这里的泛型是实际返回业务数据的类型，即返回data数据中的类型
         */
        CommonResp<PageResp<GoodsCollectionResp>> resp = new CommonResp<>();
        PageResp<GoodsCollectionResp> list = goodsService.searchCollection(req);
        resp.setData(list);
        return resp;
    }

    /**
     * 获取自己的收藏
     *
     * @param req
     * @return
     */
    @GetMapping("/recollection")
    public CommonResp getCollection(GoodsCollectionReq req) {
        /**
         * CommonResp这里的泛型是实际返回业务数据的类型，即返回data数据中的类型
         */
        CommonResp<PageResp<GoodsCollectionResp>> resp = new CommonResp<>();
        PageResp<GoodsCollectionResp> list = goodsService.getGoodsCollection(req);
        resp.setData(list);
        return resp;
    }

    /**
     * 收藏商品
     *
     * @return
     */
    @PostMapping("/collection")
    public CommonResp collectionGoods(@RequestBody GoodsCollectionReq req) {
        /**
         * CommonResp这里的泛型是实际返回业务数据的类型，即返回data数据中的类型
         */
        CommonResp<GoodsCollectionResp> resp = new CommonResp<>();
        goodsService.collectionGoods(req);
        resp.setMessage("收藏成功");
        return resp;
    }

    /**
     * 获取商品的详细信息
     *
     * @return
     */
    @GetMapping("/goodsInfoDesc")
    public CommonResp goGoodsInfo(GoodsInfoReq req) {
        /**
         * CommonResp这里的泛型是实际返回业务数据的类型，即返回data数据中的类型
         */
        CommonResp<GoodsInfoResp> resp = new CommonResp<>();
        GoodsInfoResp list = goodsService.goGoodsInfo(req);
        resp.setData(list);
        return resp;
    }

    /**
     * 搜索商品
     *
     * @return
     */
    @GetMapping("/searchInfo")
    public CommonResp searchInfo(PageReq req) {
        /**
         * CommonResp这里的泛型是实际返回业务数据的类型，即返回data数据中的类型
         */
        CommonResp<PageResp<GoodsSearchResp>> resp = new CommonResp<>();
        PageResp<GoodsSearchResp> list = goodsService.searchGoodsInfo(req);
        resp.setData(list);
        return resp;
    }

    /**
     * 获取商品的信息
     *
     * @return
     */
    @GetMapping("/goodsInfo")
    public CommonResp goodsInfo(PageReq req) {
        /**
         * CommonResp这里的泛型是实际返回业务数据的类型，即返回data数据中的类型
         */
        CommonResp<PageResp<GoodsInfoResp>> resp = new CommonResp<>();
        PageResp<GoodsInfoResp> list = goodsService.getGoodsInfo(req);
        resp.setData(list);
        return resp;
    }
}
