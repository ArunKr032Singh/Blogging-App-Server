package com.nontech.blog.response;

import com.nontech.blog.dto.UserDto;

import lombok.Data;

@Data
public class JwtAuthResponse {

	private String token;
	
	private UserDto user;
}
