package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

		@GetMapping("/memberList")
		public String memberList() {
			
			return "member/memberList";
		}
	}



