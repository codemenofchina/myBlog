package com.qiang.blog.service.impl;

import com.qiang.blog.dao.UserDao;
import com.qiang.blog.entity.User;
import com.qiang.blog.service.UserService;
import com.qiang.blog.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by xiaoqiang on 2017/7/2.
 */
@Service
public class UserServiceIpml implements UserService {

    @Autowired
    UserDao userDao;
    public List<User> queryAll(int offset, int limit) {
        return userDao.queryAll(offset,limit);
    }

    public int addUser(User user) {
        String uuid = UUID.randomUUID().toString();
        user.setUserId(uuid);
        String password = user.getPassword();
        password = MD5Util.generate(password);
        user.setPassword(password);
        return userDao.addUser(user);
    }

    public int updateUser(User user) {
        String password = user.getPassword();
        password = MD5Util.generate(password);
        user.setPassword(password);
        return userDao.updateUser(user);
    }

    public boolean login(User user) {
        User userPO = userDao.queryUserByUserName(user.getUserName());
        if(userPO != null){
            if(MD5Util.verify(user.getPassword(), userPO.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
