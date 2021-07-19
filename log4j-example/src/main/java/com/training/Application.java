package com.training;
import org.apache.log4j.Logger;
public class Application {
	
	public static void main(String[] args) {
		Logger log = Logger.getRootLogger();
	
		log.info("log4j configured correctly");
	}

}
