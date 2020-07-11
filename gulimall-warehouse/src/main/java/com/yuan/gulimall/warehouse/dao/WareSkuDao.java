package com.yuan.gulimall.warehouse.dao;

import com.yuan.gulimall.warehouse.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author yuan
 * @email yuanyaom@gmail.com
 * @date 2020-07-10 23:26:19
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
