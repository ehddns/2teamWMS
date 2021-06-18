package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayController {
		
		@GetMapping("/payList")
		public String payList() {
			
			return "pay/payList";
		}
	
	}



