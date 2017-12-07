package com.wangyi.controller;


import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wangyi.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource(name="userService")
	private UserServiceImpl us;
	
	
}
