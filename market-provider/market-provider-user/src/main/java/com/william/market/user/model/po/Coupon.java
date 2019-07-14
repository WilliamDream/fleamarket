package com.william.market.user.model.po;

import lombok.Data;

/**
 * @Auther: chaiz
 * @Date: 2019/7/3 20:45
 * @Description:
 */
@Data
public class Coupon {


    private int couponid;

    // 优惠券名
    private String name;

    // 优惠券金额
    private double amount;

    // 优惠券所属店铺 0:商城
    private int shopid;

    // 优惠券针对商品类型 0:不限
    private String type;






}
