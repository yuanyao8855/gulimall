package com.yuan.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuan.common.utils.PageUtils;
import com.yuan.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author yuan
 * @email yuanyaom@gmail.com
 * @date 2020-07-10 23:19:54
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

