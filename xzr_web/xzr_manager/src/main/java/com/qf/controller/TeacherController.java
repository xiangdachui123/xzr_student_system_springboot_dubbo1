package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Teacher;
import com.qf.service.ITeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @auther xiangjun
 * @Date 2019/11/30
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Reference
    private ITeacherService teacherService;

    @RequestMapping("/list")
    public String teacherList(Model model){
        List<Teacher> list = teacherService.list();
        model.addAttribute("teacherList",list);
        return "teacherList";
    }
}
