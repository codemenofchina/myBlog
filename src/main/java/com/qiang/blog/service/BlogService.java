package com.qiang.blog.service;

import com.qiang.blog.entity.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xiaoqiang on 2017/7/2.
 */
public interface BlogService {

    /**
     * 根据偏移量查询blog列表
     *
     * @param offset
     * @param limit
     * @param userId
     * @return
     */
    List<Blog> queryAll(@Param("offset") int offset, @Param("limit") int limit, @Param("userId") String userId);


    /**
     * 添加blog
     */
    int addBlog(Blog blog);

    /**
     * 删除blog
     * @param blogId
     */
    int delBlog(@Param("blogId") String blogId);

    /**
     * 更新blog
     * @param blog
     */
    int updateBlog(Blog blog);
}
