package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		A a1 = (A) context.getBean("aref");
//		A a1 = (A) context.getBean("aref1");
		System.out.println(a1);
		System.out.println(a1.getX());
		System.out.println(a1.getOb());
		System.out.println(a1.getOb().getY());
	}
}
