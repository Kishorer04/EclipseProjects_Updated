package com.training.log4j2;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Log4j2Demo {

	
	
	public static Logger logger = LogManager.getLogger(Log4j2Demo.class.getName()); //Object creation using Factory Design Pattern
	
	
	public static void main(String[] args) {
		
	
		
		 
		
		logger.info("Hello world");
		logger.debug("Hi debug");
		logger.error("Hi error");
		logger.warn("warn");

	}
	

}
