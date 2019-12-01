package com.qf.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.TeacherMapper;
import com.qf.entity.teacher;
import com.qf.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auth RuanHao
 * @Time 2019/12/1 17:01
 **/
@Service
public class TeacherServiceImpl  implements ITeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<teacher> getList() {
        List<teacher> teachers = teacherMapper.selectList(null);
        return teachers;
    }

    @Override
    public teacher getTeacherById(Integer id) {
        return teacherMapper.selectById(id);
    }
}
