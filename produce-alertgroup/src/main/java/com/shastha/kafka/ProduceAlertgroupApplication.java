package com.shastha.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * This class have main method from where the produce alert group application starts
 * 
 * @author Dheeraj Das
 * @version 1.0
 */
@SpringBootApplication
public class ProduceAlertgroupApplication {

	/**
	 * 
	 * The produce alert group application starts from this method.
	 * 
	 * @param args Array of string
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProduceAlertgroupApplication.class, args);
	}
}
