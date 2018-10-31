package com.calculate.incometax.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.calculate.incometax.service.CalculateTaxService;

public class ExecuteMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" #### Enter your Salary ####");
		int salary = scanner.nextInt();
		
		System.out.println(" ### Enter your Country #####");
		
		String country = scanner.next();
		
		CalculateTaxService service = ctx.getBean(CalculateTaxService.class);
		double tax = service.calculateTax(salary);
		
		System.out.println(" Tax to be paid for country " + country + " is "+tax);

	}

}
