package com.august.hang_around.controller;
import com.august.hang_around.req.GoodsInfoReq;
import com.august.hang_around.req.PageReq;
import com.august.hang_around.resp.CommonResp;
import com.august.hang_around.resp.GoodsInfoResp;
import com.august.hang_around.resp.GoodsSearchResp;
import com.august.hang_around.resp.PageResp;
import com.august.hang_around.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
     * 搜索商品
     * @return
     */
    @GetMapping("/goodsInfoDesc")
    public CommonResp goGoodsInfo(GoodsInfoReq req){
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
     * @return
     */
    @GetMapping("/searchInfo")
    public CommonResp searchInfo(PageReq req){
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
     * @return
     */
    @GetMapping("/goodsInfo")
    public CommonResp goodsInfo(PageReq req){
        /**
         * CommonResp这里的泛型是实际返回业务数据的类型，即返回data数据中的类型
         */
        CommonResp<PageResp<GoodsInfoResp>> resp = new CommonResp<>();
        PageResp<GoodsInfoResp> list = goodsService.getGoodsInfo(req);
        resp.setData(list);
        return resp;
    }
}
