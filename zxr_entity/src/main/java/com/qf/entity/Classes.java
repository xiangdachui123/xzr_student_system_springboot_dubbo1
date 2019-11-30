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
@Accessors(chain = true)
public class Classes extends BaseEntity{
    private String cname;
    private Integer total;
    private Integer tid;
}
