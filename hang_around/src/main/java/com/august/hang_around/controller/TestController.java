package com.august.hang_around.controller;

import com.august.hang_around.domain.TbUser;
import com.august.hang_around.req.TbUserReq;
import com.august.hang_around.resp.CommonResp;
import com.august.hang_around.resp.TbUserResp;
import com.august.hang_around.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 战神
 */
@RestController
@RequestMapping("/demo")
public class TestController {
     @Resource
     private TestService testService;
    @GetMapping("/list2")
    public CommonResp list2(TbUserReq req){
        CommonResp<List<TbUserResp>> resp = new CommonResp<>();
        List<TbUserResp> list = testService.list2(req);
        resp.setData(list);
        return resp;

    }
    @GetMapping("/list")
    public CommonResp list(TbUserReq req){
        CommonResp<List<TbUser>> resp = new CommonResp<>();
        List<TbUser> list = testService.list(req);
        resp.setData(list);
        return resp;

    }
}
