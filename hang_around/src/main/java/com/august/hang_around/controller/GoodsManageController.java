package com.august.hang_around.controller;

import com.august.hang_around.req.GoodsManageInsertReq;
import com.august.hang_around.req.GoodsManageReq;
import com.august.hang_around.req.GoodsManageSaveReq;
import com.august.hang_around.req.GoodsUploadReq;
import com.august.hang_around.resp.*;
import com.august.hang_around.service.GoodsManageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author 战神
 * 关于商品信息的接口
 */
@RestController
@RequestMapping("/api/v1/goods")
public class GoodsManageController {
    private static final Logger LOG = LoggerFactory.getLogger(GoodsManageController.class);
    @Resource
    private GoodsManageService goodsManageService;

    /**
     * 发布商品
     *
     * @return
     */
    @PostMapping("manage/add")
    public CommonResp addOwnGood(@Valid @RequestBody GoodsManageInsertReq req) {
        /**
         * CommonResp这里的泛型是实际返回业务数据的类型，即返回data数据中的类型
         */
        CommonResp<GoodsManageInsertResp> resp = new CommonResp<>();
        goodsManageService.addOwnGood(req);
        resp.setMessage("插入成功");
        return resp;
    }

    /**
     * 上传图片
     *
     * @param req
     * @return
     */
    @PostMapping("manage/upload")
    public CommonResp uploadImg(@RequestBody GoodsUploadReq req) {
        /**
         * CommonResp这里的泛型是实际返回业务数据的类型，即返回data数据中的类型
         */
        CommonResp<GoodsManageInsertResp> resp = new CommonResp<>();
        goodsManageService.uploadImg(req);
        resp.setMessage("插入成功");
        return resp;
    }

    /**
     * 搜索商品
     *
     * @return
     */
    @GetMapping("manage/search")
    public CommonResp searchOwnGood(GoodsManageReq req) {
        /**
         * CommonResp这里的泛型是实际返回业务数据的类型，即返回data数据中的类型
         */
        CommonResp<PageResp<GoodsManageResp>> resp = new CommonResp<>();
        PageResp<GoodsManageResp> list = goodsManageService.searchOwnGoods(req);
        resp.setData(list);
        return resp;
    }

    /**
     * 删除用户对应的商品
     *
     * @return
     */
    @DeleteMapping("/manage/delete")
    public CommonResp deleteGood(GoodsManageReq req) {
        /**
         * CommonResp这里的泛型是实际返回业务数据的类型，即返回data数据中的类型
         */
        CommonResp<GoodsManageResp> resp = new CommonResp<>();
        goodsManageService.deleteGood(req);
        resp.setMessage("删除商品成功！");
        return resp;
    }

    /**
     * 获取用户对应的商品
     *
     * @return
     */
    @GetMapping("/manage")
    public CommonResp getOwnGoodsInfo(GoodsManageReq req) {
        /**
         * CommonResp这里的泛型是实际返回业务数据的类型，即返回data数据中的类型
         */
        CommonResp<PageResp<GoodsManageResp>> resp = new CommonResp<>();
        PageResp<GoodsManageResp> list = goodsManageService.getOwnGoods(req);
        resp.setData(list);
        return resp;
    }

    /**
     * 获取当前id对应的单个商品
     *
     * @return
     */
    @GetMapping("/manage/id")
    public CommonResp getOneGoodsInfo(GoodsManageReq req) {
        /**
         * CommonResp这里的泛型是实际返回业务数据的类型，即返回data数据中的类型
         */
        CommonResp<GoodsManageResp> resp = new CommonResp<>();
        GoodsManageResp list = goodsManageService.getOneGood(req);
        resp.setData(list);
        return resp;
    }

    /**
     * 保存当前id对应的单个商品
     *
     * @return
     */
    @PostMapping("/manage/save")
    public CommonResp saveGoodInfo(@Valid @RequestBody GoodsManageSaveReq req) {
        /**
         * CommonResp这里的泛型是实际返回业务数据的类型，即返回data数据中的类型
         */
        CommonResp<GoodsManageSaveResp> resp = new CommonResp<>();
        goodsManageService.saveGood(req);
        resp.setMessage("编辑成功!");
        return resp;
    }
}
