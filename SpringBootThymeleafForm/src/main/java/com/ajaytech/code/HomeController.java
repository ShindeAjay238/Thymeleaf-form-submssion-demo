package com.ajaytech.code;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@GetMapping("/register")
	public String showForm(Model model)
	{
		Student student=new Student();
		model.addAttribute("student",student);
		
		
		  List<String> professionList= Arrays.asList(
		  
		  "Developer","Designner","Architechture","WebDEveloper");
		  model.addAttribute("professionList",professionList);
		  
		return "register_form";
	}
	
	@PostMapping("/register")
	public String submitForm(@ModelAttribute("student") Student student)
	{
		System.out.println(student);
		return "submit_success";
	}
	}

