package com.shastha.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * This class contains main class where the consume alert group application starts
 * 
 * @author Dheeraj Das
 * @version 1.0
 */
@SpringBootApplication
public class ConsumeAlertgroupApplication {

	/**
	 * 
	 * This is the main method where application starts running
	 * 
	 * @param args Array of strings
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConsumeAlertgroupApplication.class, args);
	}

}
