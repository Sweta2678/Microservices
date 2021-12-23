package com.codeoart.user.VO;

import com.codeoart.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {
	private User user;
	private Department department;

}
