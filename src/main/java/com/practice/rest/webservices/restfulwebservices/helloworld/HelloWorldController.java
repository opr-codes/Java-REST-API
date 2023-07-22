package com.practice.rest.webservices.restfulwebservices.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller will expose REST API
@RestController			//This annotation makes Controller -> RestController
public class HelloWorldController {
	
	private MessageSource messageSource;
	private HelloWorldController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	//@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	@GetMapping(path = "/hello-world")			//No need to specify method
	public String helloWorld() {				//Returning a string back
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world-bean")			
	public HelloWorldBean helloWorldBean() {		//Returning an instance(bean) of our own class
		return new HelloWorldBean("Hello World");
	}
	
	//Path Parameters		//Most of REST API urls have path parameters
	// /users/{id}/todos/{id} => /users/1/todos/101		//url to access a specfic todo of a specific user"
	// /hello-world/path-variable/{name}				//This {name} will be mapped to Path variable name below by Spring MVC
	// /hello-world/path-variable/Om
	
	@GetMapping(path = "/hello-world/path-variable/{name}")			
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {	//Whatever name we're putting is getting mapped to Path variable
		
		return new HelloWorldBean(String.format("Hello World, %s", name));		//We're picking the name from Path variable and returning it back 
	}
	
	@GetMapping(path = "/hello-world-internationalized")			
	public String helloWorldInternationalized() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
	}
	
}
