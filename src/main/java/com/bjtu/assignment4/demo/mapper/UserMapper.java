package com.bjtu.assignment4.demo.mapper;


import com.bjtu.assignment4.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from users where uname=#{uname} and upwd=#{upwd}")
    public User getUser(@Param("uname") String uname, @Param("upwd") String upwd);
}
