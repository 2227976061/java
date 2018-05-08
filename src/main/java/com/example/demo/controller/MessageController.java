package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Message;
import com.example.demo.entity.PageBean;
import com.example.demo.service.IMessageService;
import com.github.pagehelper.PageHelper;

@Controller
public class MessageController {
   @Autowired
    private IMessageService messageService;

    @RequestMapping("message/{currentPage}/{pageSize}")
    public String index(Model model, @PathVariable("currentPage") String currentPage,   @PathVariable("pageSize") String pageSize) {
        PageHelper.startPage(Integer.valueOf(currentPage), Integer.valueOf(pageSize));
        System.out.print("MessageController index ------------------------------");
        List<Message> list =  messageService.list();
        model.addAttribute("page", new PageBean<Message>(list));
        return "index";
    }

}
