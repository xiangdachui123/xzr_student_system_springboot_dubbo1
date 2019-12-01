package com.qf.service;

import com.qf.entity.Classes;

import java.util.List;

/**
 * @Auth RuanHao
 * @Time 2019/12/1 17:47
 **/
public interface IClassService {
    List<Classes> getList();

    Classes getClassesById(Integer id);

    /**
     * 添加学生后修改班级人数
     */
    Integer updateClassesCnum(Integer id);
}
