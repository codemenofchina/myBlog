package com.qiang.blog.dao;

import com.qiang.blog.entity.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by chenqiang on 2017/9/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class BlogDaoTest {

    @Autowired
    private BlogDao blogDao;

    @Test
    public void testQueryAll() {
        List<Blog> list = blogDao.queryAll(0, 10, "xiaoqiang");
        for(Blog blog: list){
            System.out.println(blog);
        }
        System.out.println("--------------------------------");
    }
}
