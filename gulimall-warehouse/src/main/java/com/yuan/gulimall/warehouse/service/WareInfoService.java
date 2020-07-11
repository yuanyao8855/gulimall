package com.yuan.gulimall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuan.common.utils.PageUtils;
import com.yuan.gulimall.warehouse.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author yuan
 * @email yuanyaom@gmail.com
 * @date 2020-07-10 23:26:19
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

