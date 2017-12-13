package com.wangyi.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wangyi.dao.UserDao;
import com.wangyi.entity.User;
import com.wangyi.service.UserService;
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource(name="userDao")
	private UserDao userdao;

	@Override
	public User checkLogin(String user_code, String user_password) {
		return userdao.getLoginUser(user_code, user_password);
	}
}
