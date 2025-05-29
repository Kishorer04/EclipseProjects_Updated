package log4jexamples;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLConfigurator {
	static Logger logger = Logger.getLogger(XMLConfigurator.class);
	public static void main(String[] args) {

		 DOMConfigurator.configure("log4j.xml");
		logger.info("hello");
		logger.error("error");
		logger.fatal("fatal");
	
		

	}

}
