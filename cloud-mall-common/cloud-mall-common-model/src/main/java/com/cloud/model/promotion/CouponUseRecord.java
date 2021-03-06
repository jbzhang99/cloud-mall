package com.cloud.model.promotion;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class CouponUseRecord implements Serializable {

    private static final long serialVersionUID = 7172548716783272475L;

    /** 优惠券使用记录ID */
    private Long couponRecordId;

    /** 用户ID */
    private Long userId;

    /** 优惠券ID */
    private Long couponId;

    /** 优惠券业务代码 */
    private String couponNo;

    /** 订单号 */
    private Long orderId;

    /** 订单业务号 */
    private Long orderNo;

    /** 使用的金额 */
    private Long usedAmount;

    /** 创建日期 */
    private LocalDateTime createTime;

    /** 更新日期 */
    private LocalDateTime updateTime;
}
