package com.spring.sExam.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PhomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(PhomeController.class);
	
	@RequestMapping(value = {"/p","/pH","/pAcheck"}, method = RequestMethod.GET)
//	public String home(Locale locale, Model model, HttpServletRequest request) {
//	int age = request.getParameter("age")==null ? 0 : Integer.parseInt(request.getParameter("age"));
	public String home(Locale locale, Model model, HttpServletRequest request, 
			@RequestParam(name="age", defaultValue = "0", required = false) int age) {
//		sysout과 동일 현재상황을 변수에 담아 저장가능 ( ____ = logger)
		logger.info("Welcome home! The client locale is {}.", locale);
		
//		국가설정 한국 시간, 날짜 사용
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/pAcheck", method = RequestMethod.POST)
	public String aCheckPost(Model model, Locale locale, 
			@RequestParam(name="name", defaultValue = "0", required = false) String name,
			@RequestParam(name="age", defaultValue="0", required=false) int age) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		String url = "";
		if(age < 20) url = "a1";
		else if(age > 20 && age < 30) url = "a2";
		else url = "a3";
		
		model.addAttribute("name", name);
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("url", url);
		model.addAttribute("age", age);
		
		return "home";
	}
}
