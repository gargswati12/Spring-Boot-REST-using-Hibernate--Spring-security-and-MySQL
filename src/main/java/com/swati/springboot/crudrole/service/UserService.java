package com.swati.springboot.crudrole.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.swati.springboot.crudrole.entity.User;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

}
