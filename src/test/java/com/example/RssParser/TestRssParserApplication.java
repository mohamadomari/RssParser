package com.example.RssParser;

import org.springframework.boot.SpringApplication;

public class TestRssParserApplication {

	public static void main(String[] args) {
		SpringApplication.from(RssParserApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
