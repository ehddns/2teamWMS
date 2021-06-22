package com.cafe2team.controller;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe2team.service.ShoppingmallService;

@Controller
public class ShoppingmallController {
	
	private static final Logger log = LoggerFactory.getLogger(ShoppingmallController.class);
	
	private final ShoppingmallService shoppingmallService;
	
	public ShoppingmallController(ShoppingmallService shoppingmallService) {
		this.shoppingmallService = shoppingmallService;
	}
	
	@PostConstruct
	public void ShoppingmallControllerInit() {
		log.info("========================================");
		log.info("ShoppingmallController 객체생성", shoppingmallService);
		log.info("========================================");
	}
	
	// 거래처 페이지
	@GetMapping("/shoppingmall")
	public String shoppingmall() {
		
		log.info("========================================");
		log.info("ShoppingmallService: {}", shoppingmallService);
		log.info("========================================");
		
		return "shoppingmall/shoppingmall";
	}
	
	// 거래처 리스트
	@GetMapping("/shoppingmallList")
	public String shoppingmallList() {
		
		return "shoppingmall/shoppingmallList";
	}
	
	
	@GetMapping("/shoppingmallMypage")
	public String shoppingmallMypage() {
		
		return "shoppingmall/shoppingmallMypage";
	}
}
