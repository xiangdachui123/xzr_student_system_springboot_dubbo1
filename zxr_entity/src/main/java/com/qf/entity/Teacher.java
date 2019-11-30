package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @auther xiangjun
 * @Date 2019/11/30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors
public class Teacher extends BaseEntity{

    private String tname;
    private boolean sex;
    private String introduce;

}
