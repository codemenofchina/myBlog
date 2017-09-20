package com.qiang.blog.web;

import com.qiang.blog.entity.User;
import com.qiang.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaoqiang on 2017/7/2.
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say(){
//        User user = new User();
//        user.setPassword("123456");
//        user.setUserAccount("account");
//        user.setUserDescribe("desc");
//        user.setUserName("qiang");
//        user.setUserType(1);
//        userService.addUser(user);
        return "hello";
    }

}
