package com.azure.demo2.spring_azure_demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoPracticeApplication {

	@GetMapping("/message")
	public String message(){
		return "hello!! your application is deployed on Azure succesfully";
	}
//	echo "# Azure-demo-example" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Sharukhq223/Azure-demo-example.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoPracticeApplication.class, args);
	}

}
