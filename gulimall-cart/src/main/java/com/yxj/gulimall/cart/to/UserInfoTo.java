package com.yxj.gulimall.cart.to;

import lombok.Data;


/**
 *
 * @author zhanglong
 */
@Data
public class UserInfoTo {

    private Long userId;

    private String userKey;

    /**
     * 是否临时用户
     */
    private Boolean tempUser = false;

}
