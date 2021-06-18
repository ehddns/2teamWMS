package com.cafe2team.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe2team.controller.UnitPriceController;
import com.cafe2team.dao.UnitPriceMapper;
import com.cafe2team.domain.Price;


@Service
@Transactional
public class UnitPriceService {
	
	private static final Logger log = LoggerFactory.getLogger(UnitPriceController.class);
	
	private final UnitPriceMapper unitPriceMapper;
	
	public UnitPriceService(UnitPriceMapper unitPriceMapper) {
		this.unitPriceMapper = unitPriceMapper;
	}
	
	@PostConstruct
	public void UnitPriceServiceInit() {
		log.info("==============================");
		log.info("UnitPriceService 객체 생성");
		log.info("==============================");
	}
	
	public List<Price> getPriceList(){
		
		
		List<Price> priceList = unitPriceMapper.getPriceList();
		
		
		return priceList;
	}
	
	public int priceAdd(Price price) {
		
		int result = unitPriceMapper.priceAdd(price);
		
		return result;
	}
	
	public int priceUpdate(Price price) {
		
		return unitPriceMapper.priceUpdate(price);
	}
}
