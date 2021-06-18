package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Price;

@Mapper
public interface UnitPriceMapper {
	
	public List<Price> getPriceList();
	
	public int priceAdd(Price price);
	
	public int priceUpdate(Price price);
}
