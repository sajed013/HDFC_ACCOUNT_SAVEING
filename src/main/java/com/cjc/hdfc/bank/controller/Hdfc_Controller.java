package com.cjc.hdfc.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hdfc_Controller {

	@GetMapping("/getinfo")
	public String Getinformation() {
		
		return "This is Hdgfc bank ,Welcome to,Hdfc_Controller class ";
	}

}
