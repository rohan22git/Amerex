package com.br.amerex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorPage {
	
	@GetMapping("/error")
	public String error() {
		return"error.html";
	}
}
