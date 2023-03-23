package com.yxj.gulimall.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 * @author zhanglong
 */
@Data
public class MemberPrice {
    private Long id;
    private String name;
    private BigDecimal price;
}
