package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Classes;
import com.qf.service.IClassService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auth RuanHao
 * @Time 2019/12/1 16:50
 **/
@Controller
@RequestMapping("/classes")
public class ClassController {
    @Reference
    private IClassService iClassService;

    @RequestMapping("list")
    public String getList(Model model){
        List<Classes> list = iClassService.getList();
        model.addAttribute("classess",list);
        return "classesShow";
    }

}
