package com.wangyi.dao;

import org.apache.ibatis.annotations.Param;

import com.wangyi.entity.User;

public interface UserDao {
	public User getLoginUser(@Param("user_code")String user_code,@Param("user_password")String user_password);
}
