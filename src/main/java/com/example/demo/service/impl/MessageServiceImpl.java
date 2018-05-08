package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Message;
import com.example.demo.mapper.MessageMapper;
import com.example.demo.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService {
	
	@Autowired
	private MessageMapper messageMapper;

	@Override
	public List<Message> list() {
		return messageMapper.list();
	}

	@Override
	public int count() {
		return messageMapper.count();
	}

}
