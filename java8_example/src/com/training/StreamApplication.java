package com.training;

import java.util.*;
import com.training.services.CreditCard;
import com.training.services.CreditCardService;
public class StreamApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<CreditCard> cards = new ArrayList<CreditCrad>();
		cards.add(new CreditCard(10233, "Ramesh", 789, 80000));
		cards.add(new CreditCard(10233, "suresh", 789, 80000));
		cards.add(new CreditCard(10233, "magesh", 789, 80000));
		cards.add(new CreditCard(10233, "naveen", 789, 80000));
		cards.add(new CreditCard(10233, "ashish", 789, 80000));
		
		CreditCardService service = new CreditCardService(cards);
		service.usingFilterAndMap();
		
	}

}
