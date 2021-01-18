package com.journaldev.bootifulmongodb;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootMongoDBApp {

	public static void main(String[] args) {
		System.out.println("========ENVIRONMENT VARIABLES===============");
		Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                              envName,
                              env.get(envName));
		}
		System.out.println("=============================================");


		SpringApplication.run(BootMongoDBApp.class, args);
	}
}