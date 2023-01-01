package com.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Samosa p = (Samosa) context.getBean("samosa");

		System.out.println(p);
		// registering shutdown hook
		context.registerShutdownHook();
	}
}
