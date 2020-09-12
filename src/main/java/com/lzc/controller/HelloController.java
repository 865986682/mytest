package com.lzc.controller;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Aspect
@Controller
public class HelloController {
    private  static  final Logger logger = Logger.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String sayHello() {
        logger.info("进入hello方法");
        return "success";
    }

    @RequestMapping("thymeleafTest")
    public String thymeleafTest(Model model) {
        model.addAttribute("key", "hello world!");
        return "test";
    }
}
