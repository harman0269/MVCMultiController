package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.model.userforform2;
import com.mvc.service.UserService;

@Controller
public class welcomeform2Controller {
	@Autowired
	//used for injecting dependencies
	private UserService userService;
	 @RequestMapping("/")
	
	public String welcome() {
		System.out.println("welcomeform2.welcome()");
		return "home";
	}
	
	@GetMapping(value="/welcomee")
	@ResponseBody
	public String reqparam(@RequestParam(name="name",defaultValue="guest")String name) {
		System.out.println("welcomeform2.reqparam()");
		return "Hello!! Mr. "+name+" how are you..?This is v1";
	}
	@GetMapping("sign-upp")
	public String formm() {
 
		System.out.println("welcomeform.form()");
		return "form2";
	}
	
	@PostMapping("/submitformm")
	public String signupWithModelAttributee(@ModelAttribute userforform2 User,Model model) {
		System.out.println("welcomeform.signupWithModelAttribute()");
		User.setId(1);
		model.addAttribute("kuser", User);
		userService.saveUser(User);
		return "resultforform2";
	}
	
	@GetMapping("/dbSuccess")
	public String signupSucess() {
		System.out.println("welcomeform.signupSucess()");
		return "databaseSuccess";
	}
	
	@PostMapping("/loginform")
	public String login(@ModelAttribute userforform2 User,Model model) {
		System.out.println("welcomeform.login()");
		return "loginForm";
	}
	
	@GetMapping("/loginform")
	public String loginn(@ModelAttribute userforform2 User,Model model) {
		System.out.println("welcomeform.login()");
		return "loginForm";
	}
	
	@PostMapping("/login")
	public String loginSucess(@ModelAttribute userforform2 User,Model model) {
		System.out.println("welcomeform.loginSuccess()");
		return "loginSuccess";
	}
	
	@GetMapping("/homepage")
	public String homepage() {
		System.out.println("welcomeform.homepage()");
		return "home";
	}
	

}

