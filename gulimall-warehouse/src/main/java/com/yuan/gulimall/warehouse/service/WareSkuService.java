package com.yuan.gulimall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuan.common.utils.PageUtils;
import com.yuan.gulimall.warehouse.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author yuan
 * @email yuanyaom@gmail.com
 * @date 2020-07-10 23:26:19
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

