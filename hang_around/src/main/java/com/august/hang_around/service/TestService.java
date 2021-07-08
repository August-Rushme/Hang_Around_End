package com.august.hang_around.service;

import com.august.hang_around.domain.TbUser;
import com.august.hang_around.domain.TbUserExample;
import com.august.hang_around.mapper.TbUserMapper;
import com.august.hang_around.req.TbUserReq;
import com.august.hang_around.resp.TbUserResp;
import com.august.hang_around.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author august
 */
@Service
public class TestService {
    @Resource
    private TbUserMapper tbUserMapper;
    /**
     * 搜索测试2
     * @param req
     * @return
     */
    public List<TbUserResp> list2(TbUserReq req){
        TbUserExample tbUserExample = new TbUserExample();
        TbUserExample.Criteria criteria = tbUserExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<TbUser> userList = tbUserMapper.selectByExample(tbUserExample);
//        List<TbUserResp> repsList = new ArrayList<>();
//        for (TbUser tbUser : userList) {
////            TbUserResp userResp = new TbUserResp();
////            BeanUtils.copyProperties(tbUser,userResp);
//            //单体复制
//            TbUserResp listResp = CopyUtil.copy(tbUser, TbUserResp.class);
//            repsList.add(listResp);
//        }
        List<TbUserResp> userResp = CopyUtil.copyList(userList, TbUserResp.class);

        return userResp;
    }

    /**
     * 搜索测试
     * @param req
     * @return
     */
    public List<TbUser> list(TbUserReq req){
        TbUserExample tbUserExample = new TbUserExample();
        TbUserExample.Criteria criteria = tbUserExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        return tbUserMapper.selectByExample(tbUserExample);
    }
}
