package com.saket.springbootjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

	@PostConstruct
	public void msg(){
		logger.info("Application Started for Jenkins");
	}

	public static void main(String[] args) {
		logger.info("Application executed for Jenkins");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
