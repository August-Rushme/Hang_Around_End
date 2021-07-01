package com.august.hang_around.service;

import com.august.hang_around.domain.TbUser;
import com.august.hang_around.mapper.TbUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 战神
 */
@Service
public class TestService {
    @Resource
    private TbUserMapper tbUserMapper;
    public List<TbUser> list(){
        return tbUserMapper.selectByExample(null);
    }
}
