package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Person p1 = (Person) ctx.getBean("person1");
		System.out.println(p1);
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println("--------------------------------------------------");
		System.out.println(p1.getFeeStructure());
		System.out.println(p1.getFeeStructure().getClass().getName());
		System.out.println("--------------------------------------------------");
		System.out.println(p1.getProps());
		System.out.println(p1.getProps().getClass().getName());

	}
}
