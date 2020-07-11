package com.yuan.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuan.common.utils.PageUtils;
import com.yuan.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author yuan
 * @email yuanyaom@gmail.com
 * @date 2020-07-10 23:02:16
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

