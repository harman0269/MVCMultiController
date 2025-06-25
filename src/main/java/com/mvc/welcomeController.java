//package com.mvc;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@RequestMapping("/v1")
//public class welcomeController {
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
//	
//	@GetMapping("/path/{id}")
//	@ResponseBody
//	public String pathvariable(@PathVariable("id")Long id){
//		System.out.println("welcomeController.pathVariable()");
//		return "Hello!! Mr. "+id+" how are you..?";
//	}
//	
//
//}
