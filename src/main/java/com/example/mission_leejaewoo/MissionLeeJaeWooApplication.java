package com.example.mission_leejaewoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MissionLeeJaeWooApplication {

	public static void main(String[] args) {
		SpringApplication.run(MissionLeeJaeWooApplication.class, args);
	}
	@RestController
	public static class TestController{
		@GetMapping("/")
		public String test(){
			return "1week";
		}
	}

}
