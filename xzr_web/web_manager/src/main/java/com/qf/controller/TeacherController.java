package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.teacher;
import com.qf.service.ITeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auth RuanHao
 * @Time 2019/12/1 16:51
 **/
@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Reference
    private ITeacherService teacherService;

    @RequestMapping("list")
    public String getList(Model model){
        List<teacher> list = teacherService.getList();
        model.addAttribute("teachers",list);
        return "teacherShow";
    }
}
