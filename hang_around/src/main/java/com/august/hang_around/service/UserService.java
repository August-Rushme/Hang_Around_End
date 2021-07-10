package com.august.hang_around.service;

import com.august.hang_around.domain.User;
import com.august.hang_around.domain.UserExample;
import com.august.hang_around.exception.BusinessException;
import com.august.hang_around.exception.BusinessExceptionCode;
import com.august.hang_around.mapper.UserMapper;
import com.august.hang_around.req.UserLoginReq;
import com.august.hang_around.req.UserRegisterReq;
import com.august.hang_around.req.UserResetReq;
import com.august.hang_around.resp.UserLoginResp;
import com.august.hang_around.resp.UserResetResp;
import com.august.hang_around.util.CopyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author august
 */
@Service
public class UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Resource
    private UserMapper userMapper;

    /**
     * 查找用户名
     * @param userName
     * @return
     */
    public User selectByUserName(String userName) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(userName);
        List<User> userList = userMapper.selectByExample(userExample);
        if (CollectionUtils.isEmpty(userList)) {
            return null;
        } else {
            return userList.get(0);
        }
    }
    /**
     * 登录
     */
    public UserLoginResp login(UserLoginReq req) {
        User userDb = selectByUserName(req.getUsername());
        if (ObjectUtils.isEmpty(userDb)) {
            // 用户名不存在
            LOG.info("用户名不存在, {}", req.getUsername());
            throw new BusinessException(BusinessExceptionCode.LOGIN_USER_ERROR);
        } else {
            if (userDb.getPassword().equals(req.getPassword())) {
                // 登录成功
                UserLoginResp userLoginResp = CopyUtil.copy(userDb, UserLoginResp.class);
                return userLoginResp;
            } else {
                // 密码不对
                LOG.info("密码不对, 输入密码：{}, 数据库密码：{}", req.getPassword(), userDb.getPassword());
                throw new BusinessException(BusinessExceptionCode.LOGIN_USER_ERROR);
            }
        }
    }
    /**
     * 注册
     */
    public void register(UserRegisterReq req){
        User user = CopyUtil.copy(req, User.class);
        User userDb = selectByUserName(req.getUsername());
        if (ObjectUtils.isEmpty(userDb)){
            //用户名没有，可以注册
            userMapper.insert(user);
        }else {
            //用户名已经存在
            throw new BusinessException(BusinessExceptionCode.USER_LOGIN_NAME_EXIST);
        }
    }
    /**
     * 修改信息
     */
    public void reset(UserResetReq req){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(req.getId());
        User user = CopyUtil.copy(req, User.class);
        userMapper.updateByExampleSelective(user,userExample);

    }
    /**
     * 获取用户的信息
     */
    public List<UserResetResp> getUserInfo(UserResetReq req){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(req.getId());
        List<User> users = userMapper.selectByExample(userExample);
        List<UserResetResp> userInfo = CopyUtil.copyList(users, UserResetResp.class);
        return userInfo;


    }
}
