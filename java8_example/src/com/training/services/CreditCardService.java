package com.training.services;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

import static java.util.stream.Collector.*;
public class CreditCardService {

	private List<CreditCard> cards;
	
	public CreditCardService(List<CreditCard> cards) {
		super();
		this.cards = cards;
		
	}
	public List<CreditCard> getCards(){
		return cards;
	}
	
	public void usingFilterAndMap() {
		
		//Using Filter Alone
		
		List<CreditCard> creditLimitMoreThan5Lakh = 
				(List<CreditCard>) this.cards.stream().filter((card) ->card.getCreditLimit()>500000)
		.collect(toList());
		
		creditLimitMoreThan5Lakh.forEach(System.out::println);
	}
	private Collector toList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// Collect to Map
	
	
}
