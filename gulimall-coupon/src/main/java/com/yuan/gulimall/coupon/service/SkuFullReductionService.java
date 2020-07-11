package com.yuan.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuan.common.utils.PageUtils;
import com.yuan.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author yuan
 * @email yuanyaom@gmail.com
 * @date 2020-07-10 23:02:16
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

