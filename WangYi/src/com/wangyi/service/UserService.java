package com.wangyi.service;

import com.wangyi.entity.User;

public interface UserService {
	public User checkLogin(String user_code,String user_password);
}
