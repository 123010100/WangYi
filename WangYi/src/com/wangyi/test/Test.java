package com.wangyi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wangyi.entity.User;
import com.wangyi.service.UserService;

public class Test {
	
	private static ApplicationContext ac;
	
	static{
		ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	private static void test(){
		UserService u =(UserService)ac.getBean("userService");
		User s=u.checkLogin("714111186","123456");
		System.out.println(s.getUser_name());
	}

	public static void main(String[] args) {
		test();
	}

}
