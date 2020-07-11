package com.yuan.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. integrate MyBatis-Plus
 *      1) add dependency
 *        <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.3.2</version>
 *        </dependency>
 *      2) setting
 *         1. setup datasource
 *             1. add database driver. add mysql driver into common module (find right driver version based on mysql version)
 *             2. in application.yaml, set datasource setting
 *         2. setup MyBatis-plus
 *             1. add @MapperScan point to dao package
 *             2. tell MyBatis-plus the sql mapping file location
 */

@MapperScan("com.yuan.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
