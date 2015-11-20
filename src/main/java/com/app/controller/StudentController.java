package com.app.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.app.model.Student;
import com.app.service.StudentService;



@Controller
@Scope("session")
@SessionAttributes("student")
public class StudentController {

	/**
	 * Handle login page request
	 * 
	 * @return
	 */

	@Autowired
	StudentService studentService;
	
	

	@RequestMapping(value = "/studentRegister", method = RequestMethod.GET)
	public String createStudentForm(Model model) {
		model.addAttribute("customer", new Student());
		return "student/register";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String saveStudent(
			@ModelAttribute("student") @Valid Student student,
			BindingResult result, HttpServletRequest request, Locale locale,Model model) {

		if (result.hasErrors()) {
			return "customer/register";
		}
		
		studentService.save(student);
		return "thankYou";
	}
	
	@RequestMapping(value = "/customer/edit", method = RequestMethod.GET)
	public String editStudentProfile(HttpSession session,Model model){
	    Student student =(Student)session.getAttribute("user");
		model.addAttribute("currentCustomer",student );
		return "customer/customerEditProfile";
	}
	
		
	
}