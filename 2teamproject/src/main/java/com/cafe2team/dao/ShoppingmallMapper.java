package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Member;

@Mapper
public interface ShoppingmallMapper {
	
	public List<Member> memberInfo();
}
