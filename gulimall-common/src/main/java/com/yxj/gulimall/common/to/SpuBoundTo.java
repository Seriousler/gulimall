package com.yxj.gulimall.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 * @author zhanglong
 */
@Data
public class SpuBoundTo {
    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;
}
