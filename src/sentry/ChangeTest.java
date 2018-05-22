package com.sentry;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

//import io.sentry.Sentry;

public class ChangeTest {
	private static final Logger logger = Logger.getLogger(ChangeTest.class);
public static void main(String[] args) {
	BasicConfigurator.configure();
//	
//	logger.debug("Debug message");
//	logger.info("Info message");
//	logger.warn("Warn message");
	
	try {
		int example = 1 / 0;
	} catch (Exception e) {
		logger.error("Caught exception!", e);
	}
	
//	 Sentry.init("your dsn");
//
//     try {
////         runSomething();
//     } catch (Exception e) {
//         Sentry.capture(e);
//     }
}
}
