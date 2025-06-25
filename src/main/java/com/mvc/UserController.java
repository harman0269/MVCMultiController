//package com.mvc;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.mvc.model.user;
//import com.mvc.service.UserService;
//
//@Controller
//public class UserController {
////	@Autowired
////	//used for injecting dependencies
////	private UserService userService;
//	
//	
//	
//	
//	@GetMapping(value="/")
//	public String welcome() {
//		System.out.println("welcomeController.welcome()");
//		return "home";
//	}
//	@GetMapping("/welcome")
//	@ResponseBody
//	public String requestParam(@RequestParam( name="myname",defaultValue="GUEST")String name){
//		System.out.println("welcomeController.requestParam()");
//		return "Hello!! Mr. "+name+" how are you..?This is v1";
//	}
//	@GetMapping("sign-up")
//	public String form() {
// 
//		System.out.println("welcomeform.form()");
//		return "form";
//	}
//	
//	@PostMapping("/submitForm")
//	public String signupWithModelAttribute(@ModelAttribute user User,Model model) {
//		System.out.println("welcomeform.signupWithModelAttribute()");
//		User.setId(1);
//		model.addAttribute("kuser", User); 
////		userService.saveUser(User);
//		return "resultformodelattribute";
//	}
//
//}
