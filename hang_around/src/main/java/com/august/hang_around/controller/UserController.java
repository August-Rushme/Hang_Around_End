package com.august.hang_around.controller;

import com.august.hang_around.req.UserLoginReq;
import com.august.hang_around.req.UserRegisterReq;
import com.august.hang_around.req.UserResetReq;
import com.august.hang_around.resp.CommonResp;
import com.august.hang_around.resp.UserLoginResp;
import com.august.hang_around.resp.UserRegisterResp;
import com.august.hang_around.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author 战神
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @PostMapping("/reset")
    public CommonResp reset(@Valid @RequestBody UserResetReq req){
        req.setPassword(DigestUtils.md5DigestAsHex(req.getNewPassword().getBytes()));
        req.getId();
        CommonResp<UserRegisterResp> resp = new CommonResp<>();
        userService.reset(req);
        resp.setMessage("修改成功");
        return resp;
    }
    /**
     * 注册
     * @param req
     * @return
     */
    @PostMapping("/register")
public CommonResp register(@Valid @RequestBody UserRegisterReq req){
    req.setPassword(DigestUtils.md5DigestAsHex(req.getPassword().getBytes()));
    CommonResp<UserRegisterResp> resp = new CommonResp<>();
    userService.register(req);
    resp.setMessage("注册成功");
    return resp;
}

    /**
     * 登录
     * @param req
     * @return
     */
    @PostMapping("/login")
    public CommonResp login(@Valid @RequestBody UserLoginReq req) {
        req.setPassword(DigestUtils.md5DigestAsHex(req.getPassword().getBytes()));
        CommonResp<UserLoginResp> resp = new CommonResp<>();
        UserLoginResp userLoginResp = userService.login(req);
        resp.setData(userLoginResp);
        return resp;
    }

}
