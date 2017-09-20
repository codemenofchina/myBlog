package com.qiang.blog.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.qiang.blog.dto.BlogDTO;
import com.qiang.blog.util.PropertiesCopyUtil;
import com.qiang.blog.dto.BaseResult;
import com.qiang.blog.entity.Blog;
import com.qiang.blog.service.BlogService;
import com.qiang.blog.vo.BlogVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by chenqiang on 2017/9/11.
 */
@RestController
@RequestMapping(value = "/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/getBlogList/{userId}/{offset}/{limit}", method = RequestMethod.GET)
    public String getBlogList(@PathVariable("userId") String userId, @PathVariable("offset") Integer offset, @PathVariable("limit") Integer limit) {
        offset = offset == null ? 0 : offset;//默认便宜0
        limit = limit == null ? 20 : limit;//默认展示50条
        List<Blog> blogs = blogService.queryAll(offset, limit, userId);
        List<BlogDTO> blogDTOList = new ArrayList<BlogDTO>();
        for(Blog blog : blogs){
            BlogDTO blogDTO = new BlogDTO();
            PropertiesCopyUtil.copyProperties(blogDTO, blog);
            blogDTOList.add(blogDTO);
        }
        BaseResult result = new BaseResult<List>(true, "查询成功");
        result.setData(blogs);
        String resultStr = JSONArray.toJSONString(blogDTOList);
        return resultStr;
    }

    @RequestMapping(value = "/addBlog", method = RequestMethod.POST)
    public String addBlog(BlogVO blogVO) {
        Blog blog = new Blog();
        PropertiesCopyUtil.copyProperties(blog, blogVO);
        System.out.println(blog.toString());
        blog.setBlogId(UUID.randomUUID().toString());
        int result = blogService.addBlog(blog);
        BaseResult resultObj;
        if(result == 1){
            resultObj = new BaseResult<Object>(true, "添加成功");
        }else{
            resultObj = new BaseResult<Object>(false, "添加失败");
        }
        String resultStr = JSON.toJSONString(resultObj);
        return resultStr;
    }

}
