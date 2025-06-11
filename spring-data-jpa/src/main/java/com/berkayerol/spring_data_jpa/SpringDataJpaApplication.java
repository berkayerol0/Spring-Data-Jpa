package com.berkayerol.spring_data_jpa;

import com.berkayerol.configuration.GlobalProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EntityScan(basePackages = {"com.berkayerol"})
@ComponentScan(basePackages = {"com.berkayerol"})
@EnableJpaRepositories(basePackages = {"com.berkayerol"})
@SpringBootApplication
@EnableConfigurationProperties(value = GlobalProperties.class)
@EnableScheduling
public class SpringDataJpaApplication {

	public static void main(String[] args) {SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
