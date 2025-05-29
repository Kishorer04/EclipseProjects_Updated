package log4jexamples;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyConfiguratorExample {

	 static Logger logger = Logger.getLogger(PropertyConfiguratorExample.class); //object creation using Factory design pattern

	public static void main(String[] args) {
		
		 PropertyConfigurator.configure("log4j.properties");
		logger.info("hello");
		logger.error("error");
		logger.fatal("fatal");
		

	}

}
