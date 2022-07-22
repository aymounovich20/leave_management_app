package com.lms;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.lms.service.LeaveManageService;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.lms.service"})
@EnableScheduling
public class LeaveManagementSystemApplication {
    @Autowired
    private LeaveManageService leaveManageService;

	public static void main(String[] args) {
		SpringApplication.run(LeaveManagementSystemApplication.class, args);
		
	}
	@Scheduled(cron = "0 */1 * ? * *")
	public void runEvey5Minutes() {
		System.out.println("Current time is :: " + LocalTime.now());
	}
	@Scheduled(cron="0 0 0 1 1/1 *")
	public void increaseBalanceMonthly() {
		leaveManageService.increaseLeaveBalance();
		System.out.println("balance increased");
	}
}
