package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Message;

public interface IMessageService {

	List<Message> list();

	int count();

}
