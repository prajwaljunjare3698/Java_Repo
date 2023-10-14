package com.logger;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class First {
	static Logger logger = Logger.getLogger("mylogger");
	
	public static void init() {
		try {
			FileHandler fh = new FileHandler("D:/workspace/eclipse-workspace/a_java_8/src/com/logger/first.txt");
//			FileHandler fh = new FileHandler("D:\\workspace\\eclipse-workspace\\a_java_8\\src\\com\\logger\\first.txt");
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);			
			logger.info("logger initalized");			
		} catch (Exception e) {
			logger.log(Level.WARNING,"exception::",e);
		}
	}
	
	public static void main(String[] args) {
		init();
		logger.info("starting of code...");
		
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			logger.warning("in catch.."+First.printStackTrace(e));
		}		
		logger.info("ending of code...");
	}
	public static String printStackTrace(Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);		
		return sw.toString();		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
