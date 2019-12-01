package com.qf.service;

import com.qf.entity.teacher;

import java.util.List;

/**
 * @Auth RuanHao
 * @Time 2019/12/1 16:54
 **/
public interface ITeacherService {
    List<teacher> getList();

    teacher getTeacherById(Integer id);
}
