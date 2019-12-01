package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Classes;
import com.qf.entity.Stu;
import com.qf.service.IClassService;
import com.qf.service.IStuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auth RuanHao
 * @Time 2019/11/30 17:16
 **/
@Controller
@RequestMapping("/stu")
public class StuController {

    @Reference
    private IStuService stuService;
    @Reference
    private IClassService iClassService;

    @RequestMapping("/list")
    public String getStudentList(Model model){
        List<Stu> list = stuService.getList();
        model.addAttribute("stuList",list);
        return "showStudent";
    }

    @RequestMapping("/add")
    public String addStu(Model model){
        List<Classes> classesList = iClassService.getList();
        model.addAttribute("classess",classesList);
        return "addStu";
    }

    @RequestMapping("/addSub")
    public String addSub(Stu stu){
        //添加学生
        stuService.addSub(stu);
        //对应班级人数加1
        iClassService.updateClassesCnum(stu.getCid());
        return "redirect:/stu/list";
    }
}
