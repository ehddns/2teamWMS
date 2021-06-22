package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Price;

@Mapper
public interface UnitPriceMapper {
	
	// 단가표 조회
	public List<Price> getPriceList();
	
	// 단가표 추가
	public int priceAdd(Price price);
	
	// 단가표 수정을 위한 조회
	public Price priceInfo(String price_Code);
	
	// 단가표 수정
	public int priceUpdate(Price price);
	
	// 단가표 삭제
	public int priceRemove(Price price);
	
	
}
