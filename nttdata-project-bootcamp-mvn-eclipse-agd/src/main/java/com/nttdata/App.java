package com.nttdata;

import org.apache.commons.lang3.StringUtils;

/**
 * Principal Class
 * 
 * @author angel
 *
 */
public class App {
	/**
	 * Principal Method
	 * @param args
	 */
	public static void main(String[] args) {
		//Message's generation
		final String message = "This is the first exercise.";
		
		//Message's execution
		sayHello(message);
	}
	
	/**
	 * Method to say hello
	 * 
	 * @param msg
	 */
	public static void sayHello(final String msg) {
		
		//Integrety validation
		if (StringUtils.isNoneBlank(msg)) {
			//Message printed
			System.out.println(msg);
			
		}else {
			
			//Error message
			System.out.println("ERROR");
		}
		
	}
}