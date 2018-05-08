package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> list() {
		return userMapper.list();
	}

	@Override
	public int count() {
		return userMapper.count();
	}

}
