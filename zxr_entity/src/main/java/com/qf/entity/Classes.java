package com.qf.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Auth RuanHao
 * @Time 2019/12/1 17:43
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Classes extends BaseEntity {
    private String cname;
    private Integer cnum;
    private Integer tid;
    @TableField(exist = false)
    private teacher teacher;
}
