package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
public class UsingBuiltInFunctionalInterface {

	public void usingPredicate() {
		
		Predicate<Double> checkHousingLoanEligibility = 
				(salaryPerMonth) -> {
					
					boolean result = false;
					
					if(salaryPerMonth>30000) {
						result = true;
					}
					
					return result;
		};
		System.out.println("Ramesh with salary 2000 is eligible : "+ checkHousingLoanEligibility.test(20000.00));
		System.out.println("sumesh with salary 2000 is eligible : "+ checkHousingLoanEligibility.test(80000.00));
		
				
	}
	public void usingConsumer() {
		List<String> names = new ArrayList<>();
		names.add("Anand");
		names.add("Zahir");
		names.add("Naveen");
		names.add("Ramesh");
		
		//consumer takes argument but doesn't return 
		Consumer<String> print = (name) -> System.out.println(name);
		
		//names.forEach(print);
		// passing method reference
		names.forEach(System.out::println);
	}
	
	public void usingFunction() {
		Function<Double,Double> curencyConverter = (inr) -> inr/70;
		System.out.println("inr to usd : "+curencyConverter.apply(100.00));
		
	}
	
	public static void main(String[] args) {
		UsingBuiltInFunctionalInterface obj = new UsingBuiltInFunctionalInterface();
		obj.usingPredicate();
		obj.usingConsumer();
		obj.usingFunction();
	}
}
