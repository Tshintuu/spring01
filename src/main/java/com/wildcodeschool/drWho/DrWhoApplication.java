package com.wildcodeschool.drWho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DrWhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrWhoApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index(){
		return "<h2>Please select your favorite doctor:</h2><ul><li><a href='/doctor/1'>First doctor</a></li><li><a href='/doctor/4'>Fourth doctor</a></li><li><a href='/doctor/10'>Tenth doctor</a></li><li><a href='/doctor/13'>Thirteenth doctor</a></li></ul>";
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1(){
		return "William Hartnell";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4(){
		return "Tom Baker";
	}

	@RequestMapping("/doctor/10")
	@ResponseBody
	public String doctor10(){
		return "David Tennant";
	}

	@RequestMapping("/doctor/13")
	@ResponseBody
	public String doctor13(){
		return "Jodie Whittaker";
	}

	

}
