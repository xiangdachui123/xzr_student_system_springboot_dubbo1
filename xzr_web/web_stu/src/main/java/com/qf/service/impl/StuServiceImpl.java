package com.qf.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.StuMapper;
import com.qf.entity.Classes;
import com.qf.entity.Stu;
import com.qf.entity.teacher;
import com.qf.service.IClassService;
import com.qf.service.IStuService;
import com.qf.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auth RuanHao
 * @Time 2019/11/30 15:40
 **/
@Service
public class StuServiceImpl implements IStuService {

    @Autowired
    private StuMapper stuMapper;
    @Reference
    private IClassService iClassService;
    @Reference
    private ITeacherService iTeacherService;

    @Override
    public List<Stu> getList() {
        List<Stu> stus = stuMapper.selectList(null);
        for (Stu s:stus) {
            Integer cid=s.getCid();
            Classes classes = iClassService.getClassesById(cid);
            teacher teacher = iTeacherService.getTeacherById(classes.getTid());
            s.setClasses(classes);
            s.setTeacher(teacher);
        }
        return stus;
    }

    /**
     * 添加学生
     * @param stu
     * @return
     */
    @Override
    public Integer addSub(Stu stu) {
        return stuMapper.insert(stu);
    }
}
