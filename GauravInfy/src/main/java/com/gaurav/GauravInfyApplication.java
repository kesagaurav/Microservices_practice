package com.gaurav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.gaurav.repository.ProductRepository")
public class GauravInfyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GauravInfyApplication.class, args);
	}

}
