package com.jason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class WebDemoApplication {

	@GetMapping("/")
	@ResponseBody
	public String index(){
		return "Hello World!";
	}

	@GetMapping("/hello")
	@ResponseBody
	public String getString(){
		return "Hello World again!";
	}

	@GetMapping("/helloTest")
	@ResponseBody
	public String getString2(){
		return "test, test. Hello World again!";
	}

	@GetMapping("/helloTest3")
	@ResponseBody
	public String getString3(){
		return "test, test, test. Hello World again!";
	}

	public static void main(String[] args) {
		SpringApplication.run(WebDemoApplication.class, args);
	}

}
