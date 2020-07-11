package com.yuan.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yuan.gulimall.product.entity.BrandEntity;
import com.yuan.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("this update test 2");
//        brandEntity.setName("test update name");
//        brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1));
        System.out.println("save success...");
    }

}
