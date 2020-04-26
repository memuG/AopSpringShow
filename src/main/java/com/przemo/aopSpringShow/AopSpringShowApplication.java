package com.przemo.aopSpringShow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopSpringShowApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopSpringShowApplication.class, args);
	}

}
