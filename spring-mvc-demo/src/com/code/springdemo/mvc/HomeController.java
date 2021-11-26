package com.code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {

	@RequestMapping("/show")
	
	public String showPage() {
	    return "main-menu";
	}
	

	
	/*
	public ModelAndView showPage() {
	    return "main-menu";
		//ModelAndView page = new ModelAndView("main-menu");
		//return page;
	}
	 */
}
