package com.qiang.blog.service;

import com.qiang.blog.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xiaoqiang on 2017/7/2.
 */
public interface UserService {

    /**
     * 根据偏移量查询用户列表
     *
     * @param offset
     * @param limit
     * @return
     */
    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 添加用户
     * @param user
     */
    int addUser(User user);


    /**
     * 修改用户
     * @param user
     */
    int updateUser(User user);

    /**
     * 用户登录验证
     * @param user
     */
    boolean login(User user);
}
