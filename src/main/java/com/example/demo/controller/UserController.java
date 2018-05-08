package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.PageBean;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import com.github.pagehelper.PageHelper;

/**
 * Created by BABAI HOLIDINGS on 2018/4/24.
 */
@Controller
public class UserController {
	
    @Autowired
    private IUserService userService;

    @RequestMapping("hello/{currentPage}/{pageSize}")
    public String helloword(Model model, @PathVariable("currentPage") String currentPage, @PathVariable("pageSize") String pageSize){
        PageHelper.startPage(Integer.valueOf(currentPage), Integer.valueOf(pageSize));
        List<User> list =  userService.list();
        model.addAttribute("user", new PageBean<User>(list));
        return "user";
    }
    
    
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String, Object> map) {
        map.put("hello", "from TemplateController.helloHtml");
        return "/helloHTML";
    }
    

}
