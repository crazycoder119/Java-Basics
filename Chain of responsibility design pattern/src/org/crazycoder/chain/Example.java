package org.crazycoder.chain;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Example {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Example.class.getName());
		logger.setLevel(Level.WARNING);
		
		logger.log(Level.INFO, "This is info");
		logger.log(Level.WARNING, "This is warn");
		logger.log(Level.FINE, "This si fine");
		logger.log(Level.SEVERE, "This is servere");
	}
}
