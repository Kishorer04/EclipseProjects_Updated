package com.logger.demo;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemoClass {

	public static Logger logger = LogManager.getLogger(LoggerDemoClass.class.getName());
	
	
	public static void main(String[] args) {
 
		logger.info("Hello world");
		logger.debug("Hi debug");
		logger.error("Hi error");
		logger.warn("warn");
		logger.info("Good");

	}
	
	

}
