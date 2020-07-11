package com.yuan.gulimall.coupon.dao;

import com.yuan.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yuan
 * @email yuanyaom@gmail.com
 * @date 2020-07-10 23:02:16
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
