package com.shastha.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * This class include the main method .
 * @author Jishnu Prasad
 *@version 1.0
 */

@SpringBootApplication
public class ConsumeCustomerApplication {

	/**
	 * This is the Main method
	 * The main() method is the entry point into the application.
	 * @param args Command-line arguments are passed through the args parameter, which is an array of String s.
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConsumeCustomerApplication.class, args);
	}

}
