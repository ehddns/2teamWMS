package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContractController {
		
		// 거래계약 등록
		@GetMapping("/contractList")
		public String contractList() {
			
			return "contract/contractList";
		}
		
		@GetMapping("/warContractList")
		public String  warContractList() {
			
			return "contract/warContractList";
		}
	
	}



