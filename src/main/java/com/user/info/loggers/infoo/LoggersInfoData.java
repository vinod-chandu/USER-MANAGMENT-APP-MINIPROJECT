package com.user.info.loggers.infoo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggersInfoData {
	public Logger logger;
	 
	//private static final Logger log = LoggerFactory.getLogger(UserRegisterController.class);
private static LoggersInfoData loggerInfoData = null;

	private LoggersInfoData() {
		System.out.println("THIS IS LOGGER CONSTRUCTOR");
		
	}

	public static LoggersInfoData getInstance() {
		if (loggerInfoData == null) {
			// Logger logger= LoggerFactory.getLogger(LoggersInfoData.class);
			 LoggersInfoData loggersInfoData = new LoggersInfoData();
		final Logger log = LoggerFactory.getLogger(LoggersInfoData.class);
		}
		return loggerInfoData;

	}
}
