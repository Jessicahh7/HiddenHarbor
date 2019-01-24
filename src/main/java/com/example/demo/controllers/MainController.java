package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@GetMapping("/")
	public ModelAndView indexMethod() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

	
	@GetMapping("/red-wine")
	public ModelAndView redWineMethod() {
		ModelAndView mv = new ModelAndView("redWine");
		return mv;
	}
	
	@GetMapping("/white-wine")
	public ModelAndView whiteWineMethod() {
		ModelAndView mv = new ModelAndView("whiteWine");
		return mv;
	}
	
	@GetMapping("/chardonnay")
	public ModelAndView chardonnayMethod() {
		ModelAndView mv = new ModelAndView("chardonnay");
		return mv;
	}
	
	@GetMapping("/pinot-noir")
	public ModelAndView pinotNoirMethod() {
		ModelAndView mv = new ModelAndView("pinot-noir");
		return mv;
	}
}
