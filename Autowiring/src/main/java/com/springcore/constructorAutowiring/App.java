package com.springcore.constructorAutowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/constructorAutowiring/config.xml");

		Employee e = context.getBean("employee", Employee.class);

		System.out.println(e);
	}
}
