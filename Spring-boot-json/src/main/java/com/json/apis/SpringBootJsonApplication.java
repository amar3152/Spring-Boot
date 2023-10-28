package com.json.apis;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class SpringBootJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJsonApplication.class, args);
	}

}
