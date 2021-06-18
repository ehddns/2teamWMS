package com.cafe2team.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe2team.domain.Price;
import com.cafe2team.service.UnitPriceService;

@Controller
public class UnitPriceController {

	private static final Logger log = LoggerFactory.getLogger(UnitPriceController.class);
	
	private final UnitPriceService unitPriceService;
	
	
	public UnitPriceController(UnitPriceService unitPriceService) {
		this.unitPriceService = unitPriceService;
	}
	
	@GetMapping("/priceList")
	public String getUnitPriceList(Model model) {
		
		
		log.info("========================================");
		log.info("unitPriceService: {}", unitPriceService);
		log.info("========================================");
		
		model.addAttribute("title", "단가표");
		model.addAttribute("priceList", unitPriceService.getPriceList());
		
		return "unitPrice/priceList";
	}
	
	@GetMapping("/priceAdd") 
	public String getUnitPriceAdd(Model model) {
		
		model.addAttribute("title", "단가표 추가");
		
		return "unitPrice/priceAdd";
	}
	
	@PostMapping("/priceAdd")
	public String priceAdd(Price price) {
		
		log.info("========================================");
		log.info("price : {} " , price);
		log.info("========================================");
		
		unitPriceService.priceAdd(price);
		
		return "redirect:/priceList";
	}
	
	
	
	
}
