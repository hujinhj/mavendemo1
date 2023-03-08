package com.nowcoder.community.dao;


import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId,int offset ,int limit);//目的是我的发言中可以查询到自己发言的内容。offset开始行号

    int selectDiscussPostRows(@Param("userId") int userId);//sql中要动态使用一个参数，而且sql只有这一个参数要取别名


}
