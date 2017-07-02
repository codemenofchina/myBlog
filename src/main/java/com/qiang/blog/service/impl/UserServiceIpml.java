package com.qiang.blog.service.impl;

import com.qiang.blog.dao.UserDao;
import com.qiang.blog.entity.User;
import com.qiang.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void addUser(User user) {
        userDao.addUser(user);
    }
}
