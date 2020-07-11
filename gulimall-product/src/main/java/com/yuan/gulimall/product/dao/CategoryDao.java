package com.yuan.gulimall.product.dao;

import com.yuan.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yuan
 * @email yuanyaom@gmail.com
 * @date 2020-07-02 19:08:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
