package com.training.interfaces;
import java.util.*;

import com.training.Invoice;
public interface CrudRepository<Incoice> {
	public boolean save(Invoice inv);
	public List<Invoice> findAll();

}
