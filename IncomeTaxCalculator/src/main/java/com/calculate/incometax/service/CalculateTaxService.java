package com.calculate.incometax.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateTaxService {
	public double calculateTax(int salary){
		
		if (salary < 200000){
			return 0;
		}else if (salary <= 200000 && salary > 500000){
			return ((salary - 200000)*0.1);
		}else if (salary <= 500000 && salary > 100000){
			return ((salary - 500000)*0.2 + 30000);
		}else{
			return ((salary - 1000000)*0.3 + 50000 );
		}
	}
	
}
