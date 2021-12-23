package com.codeoart.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/fallback")

public class FallBackMethodController {
	@GetMapping("/users")
   // @HystrixCommand(fallbackMethod = "defaultGreeting")
	public String userServiceFallBackMethod() {
		return "User Service is taking longer than expected. Please Try Again!!";
	} 

	@GetMapping("/departments")
	public String departmentServiceFallBackMethod() {
		return "Department Service is taking longer than expected. Please Try Again!!";
	} 
}
