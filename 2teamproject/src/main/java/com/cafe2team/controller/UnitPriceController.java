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
	// 단가표 조회
	@GetMapping("/priceList")
	public String getUnitPriceList(Model model) {
		
		
		log.info("========================================");
		log.info("unitPriceService: {}", unitPriceService);
		log.info("========================================");
		
		model.addAttribute("title", "단가표");
		model.addAttribute("priceList", unitPriceService.getPriceList());
		
		return "unitPrice/priceList";
	}
	
	// 단가표 추가
	@GetMapping("/priceAdd") 
	public String getUnitPriceAdd(Model model) {
		
		model.addAttribute("title", "단가표 추가");
		
		return "unitPrice/priceAdd";
	}
	
	// 단가표 추가
	@PostMapping("/priceAdd")
	public String priceAdd(Price price) {

		log.info("========================================");
		log.info("화면에서 입력 받은 값(화면등록 Post) : {} " , price);
		log.info("========================================");
		
		unitPriceService.priceAdd(price);
		
		return "redirect:/priceList";
	}
	
	// 단가표 수정
	@GetMapping("/priceUpdate")
	public String priceUpdate(@RequestParam(name = "price_Code", required = false)String price_Code, Model model) {
		
		Price price = unitPriceService.priceInfo(price_Code);
		
		log.info("========================================");
		log.info("Price@@@@@@@@@@@@@@ : {} " , price);
		log.info("========================================");
		
		model.addAttribute("title", "단가표 수정");
		model.addAttribute("price", price);
		
		return "unitPrice/priceUpdate";
	}
	
	// 단가표 수정
	@PostMapping("/priceUpdate")
	public String priceUpdate(Price price) {
		
		log.info("========================================");
		log.info("화면에서 수정한 값 (화면 수정 POST) : {} " , price);
		log.info("========================================");
		
		unitPriceService.priceUpdate(price);
		
		return "redirect:/priceList";
	}
	
	// 단가표 삭제
	@GetMapping("/priceRemove")
	public String priceRemove(@RequestParam(value = "price_Code", required = false)String price_Code, Model model) {
		
		Price price = unitPriceService.priceInfo(price_Code);
		
		log.info("========================================");
		log.info("삭제 Get (price_Code) : {} " , price);
		log.info("========================================");
		
		
		model.addAttribute("title", "단가표 삭제");
		model.addAttribute("price", price);
		
		return "unitPrice/priceRemove";
	}
	
	@PostMapping("priceRemove")
	public String priceRemove(Price price) {
		
		log.info("========================================");
		log.info("삭제 Post (Price) : {} " , price);
		log.info("========================================");
		
		unitPriceService.priceRemove(price);
		
		return "redirect:/priceList";
	}
	
}
