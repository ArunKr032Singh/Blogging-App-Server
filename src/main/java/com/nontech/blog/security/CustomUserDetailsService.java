package com.nontech.blog.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nontech.blog.entities.User;
import com.nontech.blog.execeptions.ResourceNotFoundException;
import com.nontech.blog.repository.UserRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = this.userRepo.findByEmail(username).orElseThrow(()->new ResourceNotFoundException("User", "email :"+username, 0));
		return user;
	}

}
