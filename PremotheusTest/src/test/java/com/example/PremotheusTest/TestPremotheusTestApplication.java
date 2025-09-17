package com.example.PremotheusTest;

import org.springframework.boot.SpringApplication;

public class TestPremotheusTestApplication {

	public static void main(String[] args) {
		SpringApplication.from(PremotheusTestApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
