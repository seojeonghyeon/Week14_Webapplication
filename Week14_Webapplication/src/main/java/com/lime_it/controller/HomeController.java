package com.lime_it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lime_it.domain.ClassVO;
import com.lime_it.domain.OneVO;
import com.lime_it.domain.TwoVO;
import com.lime_it.service.FourServiceImpl;
import com.lime_it.service.OneServiceImpl;
import com.lime_it.service.ThreeServiceImpl;
import com.lime_it.service.TwoServiceImpl;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	OneServiceImpl oneservice;
	
	@Autowired
	TwoServiceImpl twoservice;
	
	@Autowired
	ThreeServiceImpl threeservice;
	
	@Autowired
	FourServiceImpl fourservice;
	
	@RequestMapping("/")
	public String home(Model model) {
		logger.info("First Page");
		return "home";
	}
	@RequestMapping("/class")
	public String classAccess(Model model) {
		logger.info("class Page");
		return "main";
	}
	@RequestMapping("/class/1")
	public String classOne(Model model) {
		logger.info("class One Page");
		List<OneVO> voList = oneservice.SessionPoint();
		model.addAttribute("OneVOs", voList);
		return "One";
	}
	@RequestMapping("/class/2")
	public String classTwo(Model model) {
		logger.info("class Two Page");
		TwoVO vo = twoservice.SessionSection();
		System.out.println(vo);
		System.out.println(vo.getKu());
		model.addAttribute("twoVO", vo);
		return "Two";
	}
	@RequestMapping("/class/3")
	public String classThree(Model model) {
		logger.info("class Three Page");
		model.addAttribute("classVO", new ClassVO());
		return "Three";
	}
	@RequestMapping(value = "/class/save", method = RequestMethod.POST)
	public String classSave(Model model, @Valid ClassVO classVO, BindingResult result) {
		logger.info("class Save Page");
		if(result.hasErrors()){
			System.out.println("======Form data does not validated");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error : errors){
				System.out.println(error.getDefaultMessage());
			}
			return "Three";
		}
		System.out.println(classVO);
		threeservice.InsertTheClass(classVO);
		return "main";
	}
	@RequestMapping("/class/4")
	public String classFour(Model model) {
		logger.info("class Four Page");
		List<ClassVO> voList = fourservice.Bring2018();
		model.addAttribute("ClassVOs", voList);
		return "Four";
	}
}
