package com.czw.login.controller;

import com.czw.login.LoginApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class UserController {
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
    @RequestMapping("/login")
    @ResponseBody
    public String userLogin(){
        return "登录成功";
    }
}
