package com.yuan.gulimall.member.dao;

import com.yuan.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yuan
 * @email yuanyaom@gmail.com
 * @date 2020-07-10 23:12:46
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
