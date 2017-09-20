package com.qiang.blog.web;

import com.alibaba.fastjson.JSONArray;
import com.qiang.blog.dto.BaseResult;
import com.qiang.blog.entity.User;
import com.qiang.blog.service.UserService;
import com.qiang.blog.util.PropertiesCopyUtil;
import com.qiang.blog.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenqiang on 2017/9/16.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(UserVO userVO){
        User user = new User();
        PropertiesCopyUtil.copyProperties(user, userVO);
        int result = userService.addUser(user);
        BaseResult<Object> baseResult;
        if(result == 1) {
            baseResult = new BaseResult<Object>(true, "注册成功");
        } else {
            baseResult = new BaseResult<Object>(false, "注册失败");
        }
        return JSONArray.toJSONString(baseResult);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(UserVO userVO){
        User user = new User();
        PropertiesCopyUtil.copyProperties(user, userVO);
        boolean result = userService.login(user);
        BaseResult<Object> baseResult;
        if(result){
            baseResult = new BaseResult<Object>(true, "登录成功");
        } else {
            baseResult = new BaseResult<Object>(false, "用户名或者密码错误");
        }
        return JSONArray.toJSONString(baseResult);
    }
}
