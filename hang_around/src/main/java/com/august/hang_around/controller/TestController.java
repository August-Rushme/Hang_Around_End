package com.august.hang_around.controller;

import com.august.hang_around.domain.TbUser;
import com.august.hang_around.domain.TbUserExample;
import com.august.hang_around.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @GetMapping("/list")
    public List<TbUser> list(){
      return  testService.list();
    }
}
