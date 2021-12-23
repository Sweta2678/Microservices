package com.codeoart.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeoart.user.VO.ResponseTemplateVo;
import com.codeoart.user.entity.User;
import com.codeoart.user.service.UserService;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import lombok.extern.slf4j.Slf4j;

@RestController

@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/")
    //@HystrixCommand(fallbackMethod = "defaultGreeting")
	public User saveUser(@RequestBody User user) {
		log.info("inside save user method of UserController");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVo getUserWithDepartmnt(@PathVariable("id") Long userId) {
		return userService.getUserWithDepartment(userId);
	}
}

