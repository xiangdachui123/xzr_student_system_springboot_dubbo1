package com.qf.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.ClassesMapper;
import com.qf.entity.Classes;
import com.qf.entity.teacher;
import com.qf.service.IClassService;
import com.qf.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auth RuanHao
 * @Time 2019/12/1 17:48
 **/
@Service
public class ClassesServiceImpl implements IClassService {

    @Autowired
    private ClassesMapper classesMapper;
    @Reference
    private ITeacherService iTeacherService;

    @Override
    public List<Classes> getList() {
        List<Classes> classes = classesMapper.selectList(null);
        for (Classes cla:classes ) {
            Integer tid=cla.getTid();
            teacher teacher = iTeacherService.getTeacherById(tid);
            cla.setTeacher(teacher);
        }
        return classes;
    }

    /**
     * 根据班级id查询对应班级的信息
     * @param id
     * @return
     */
    @Override
    public Classes getClassesById(Integer id) {
        return classesMapper.selectById(id);
    }

    /**
     * 添加学生后修改班级人数
     */
    @Override
    public Integer updateClassesCnum(Integer id) {
        Classes classes = classesMapper.selectById(id);
        classes.setCnum(classes.getCnum()+1);
        return classesMapper.updateById(classes);
    }


}
