package com.spring.sExam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/atom")
public class PatomController {
	
	@RequestMapping(value = {"/pA1","/pAtom1"}, method = RequestMethod.GET)
	public String a1Get(Model model, HttpServletRequest request) {
		String name = request.getParameter("name")==null ? "" : request.getParameter("name");
		
		model.addAttribute("book", "미움받을 용기");
		model.addAttribute("name", name);
		
		String gender = genderCheck(name);
		model.addAttribute("gender", gender);
		
		return "atom/a1";
	}
	
	private String genderCheck(String name) {
		String gender = "";
		if(name.equals("홍길동")) gender= "남자";
		else if(name.equals("김말숙")) gender = "여자";
		return gender;
	}

	@RequestMapping(value = "/pA2", method = RequestMethod.GET)
	public String a2Get(Model model, @RequestParam(name="name", defaultValue = "", required = false) String name) {
		
		model.addAttribute("book", "아프니까 청춘이다");
		model.addAttribute("name", name);
		
		String gender = genderCheck(name);
		model.addAttribute("gender", gender);
		
		return "atom/a2";
	}
	
	@RequestMapping(value = "/pA3", method = RequestMethod.GET)
	public String a3Get(Model model, String name) {
		
		model.addAttribute("book", "유승선 일대기");
		model.addAttribute("name", name);
		
		String gender = genderCheck(name);
		model.addAttribute("gender", gender);
		
		return "atom/a3";
	}
	
}
