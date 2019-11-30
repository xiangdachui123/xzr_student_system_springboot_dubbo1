package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther xiangjun
 * @Date 2019/11/30
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {



    @RequestMapping("/list")
    public String teacherList(){

        return null;
    }
}
