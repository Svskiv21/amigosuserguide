package com.example.amigosuserguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration
@SpringBootApplication
public class AmigosUserGuideApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigosUserGuideApplication.class, args);
	}

}
