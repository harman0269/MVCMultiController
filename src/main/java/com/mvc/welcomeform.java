//package com.mvc;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.mvc.model.user;
//
//import jakarta.servlet.http.HttpServletRequest;
//
//@Controller
//public class welcomeform {
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
//	//USING REQUESTPARAM
////	@PostMapping("/submitForm")
////	public String signup(@RequestParam(name="userName")String name,@RequestParam(name="email")String email,Model model) {
//// System.out.println("hello "+name+"welcome...... ");
////		model.addAttribute("userName",name);
////		model.addAttribute("email",email);
////		return "result";
////	}
//	
//	
//	
//	
//	//USING SERVLET
////	@PostMapping("/submitFormwithservlet")
////	public String servletForm(HttpServletRequest req,Model model) {
////		String name=req.getParameter("userName");
////		String email=req.getParameter("email");
////		
////		
//// System.out.println("hello "+name+"welcome...... ");
////		model.addAttribute("userName",name);
////		model.addAttribute("email",email);
////		return "result";
////	}
//	
//	
//	
//	
//	//USING ANNONTATION @ModelAttribute for taking multiple fields in the form by using only 1 annontation instead of using @RequestParam for each field
//	@PostMapping("/submitForm")
//	public String signupWithModelAttribute(@ModelAttribute user User,Model model) {
//		System.out.println("welcomeform.signupWithModelAttribute()");
//		User.setId(1);
//		model.addAttribute("kuser", User); 
//		return "resultformodelattribute";
//	}
//	
//	
//	
//	//SAME THING USING @RequestParam
////	@PostMapping("/submitForm")
////	public String signup(@RequestParam(name="userName")String name,@RequestParam(name="email")String email,Model model) {
//// 
////		user u=new user();
////		u.setId(2);
////		u.setUserName(name);
////		u.setEmail(email);
////		
////		model.addAttribute("kuser",u);
////		System.out.println("welcomeform.signup()");
////		
////		return "resultformodelattribute";
////	}
//
//}
//
