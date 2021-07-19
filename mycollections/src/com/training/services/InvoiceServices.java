package com.training.services;

import java.util.*;

import com.training.Invoice;
import com.training.interfaces.CrudRepository;

public class InvoiceServices implements CrudRepository<Invoice> {
	
	private List<Invoice> invoiceList;
	

	public InvoiceServices() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(Invoice inv) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Invoice> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
