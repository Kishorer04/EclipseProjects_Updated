package log4jexamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {
	static Logger logger = Logger.getLogger(BasicConfiguratorExample.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.info("hello");
		logger.error("error");
		logger.fatal("fatal");
		
	
		
	}

}
