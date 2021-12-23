package com.codeoart.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.codeoart.user.VO.Department;
import com.codeoart.user.VO.ResponseTemplateVo;
import com.codeoart.user.controller.UserController;
import com.codeoart.user.entity.User;
import com.codeoart.user.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("inside save user method of UserService");

		return userRepository.save(user);
	}

	public ResponseTemplateVo getUserWithDepartment(Long userId) {
		ResponseTemplateVo vo = new ResponseTemplateVo();
		User user = userRepository.findByUserId(userId);
		
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(),Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}
	
	

}
