package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This is from Spring MVC // this helps to handle REST requests (PUT,GET,UPDATE,DELETE)
public class HelloController {
	
	@RequestMapping("/hello") // buy default it is GET request. If you want to handle any specific request then you have to mention.
	public String sayHi() {
		return "Hii";
	}

}
