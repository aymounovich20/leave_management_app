package com.lms.service;

import java.time.LocalDate;

import org.springframework.scheduling.annotation.Scheduled;

public class JobSchedulerService {

	@Scheduled(cron = "0 */1 * ? * *")
	public void runEvey5Minutes() {
	System.out.println("Current time is :: " + LocalDate.now());
	}
	
}
