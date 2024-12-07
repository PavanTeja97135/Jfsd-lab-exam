package com.klef.jfsd.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.klef.jfsd.exam.model")
@EnableJpaRepositories(basePackages = "com.klef.jfsd.exam.repository")

@SpringBootApplication
public class JfsdendsemlabexamApplication {

	public static void main(String[] args) {
		SpringApplication.run(JfsdendsemlabexamApplication.class, args);
	}

}
