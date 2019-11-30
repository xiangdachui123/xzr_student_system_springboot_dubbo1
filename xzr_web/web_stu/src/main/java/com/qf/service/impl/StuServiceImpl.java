package com.qf.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.StuMapper;
import com.qf.entity.Stu;
import com.qf.service.IStuService;
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

    @Override
    public List<Stu> getList() {
        List<Stu> stus = stuMapper.selectList(null);
        return stus;
    }
}
