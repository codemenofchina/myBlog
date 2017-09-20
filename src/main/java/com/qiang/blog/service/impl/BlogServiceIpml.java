package com.qiang.blog.service.impl;

import com.qiang.blog.dao.BlogDao;
import com.qiang.blog.entity.Blog;
import com.qiang.blog.service.BlogService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaoqiang on 2017/7/2.
 */
@Service
public class BlogServiceIpml implements BlogService {

    @Autowired
    BlogDao blogDao;
    public List<Blog> queryAll(int offset, int limit, String userId) {
        return blogDao.queryAll(offset,limit, userId);
    }

    public int addBlog(Blog blog) {
        return blogDao.addBlog(blog);
    }

    public int delBlog(@Param("blogId") String blogId) {
        return blogDao.delBlog(blogId);
    }

    public int updateBlog(Blog blog) {
        return blogDao.updateBlog(blog);
    }
}
