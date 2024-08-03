package com.example.RssParser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RssParserApplication {

	public static void main(String[] args) {
		SpringApplication.run(RssParserApplication.class, args);
	}

}
