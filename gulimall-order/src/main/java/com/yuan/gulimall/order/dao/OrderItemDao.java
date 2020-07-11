package com.yuan.gulimall.order.dao;

import com.yuan.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yuan
 * @email yuanyaom@gmail.com
 * @date 2020-07-10 23:19:54
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
