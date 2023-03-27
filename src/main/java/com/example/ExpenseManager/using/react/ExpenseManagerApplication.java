package com.example.ExpenseManager.using.react;

import com.example.ExpenseManager.using.react.Repository.ExpenseRepository;
import com.example.ExpenseManager.using.react.entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.util.Date;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class})
public class ExpenseManagerApplication  implements CommandLineRunner {

//	@Autowired
//	Expense expense;

	@Autowired
	ExpenseRepository expenseRepository;


	public static void main(String[] args) {
		SpringApplication.run(ExpenseManagerApplication.class, args);
	}
	@Override
	public void run(String... args){
		Expense e1 = new Expense("1","Toilet paper", new Date(),200);
		expenseRepository.save(e1);
	}
}
