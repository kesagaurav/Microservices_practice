package com.gaurav;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication//(exclude={DataSourceAutoConfiguration.class})
//@ComponentScan(basePackages = "com.gaurav.repository.EmployeeRepository")
public class GauravMicroserviceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(GauravMicroserviceApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		LocalDate localDate = LocalDate.now();
		System.out.println("date is " + localDate);
		String mess=localDate.getDayOfWeek().toString().toLowerCase();
		System.out.println(mess);
	}

}
