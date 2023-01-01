package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/collections/collectionconfig.xml");
		Emp e1 = (Emp) ctx.getBean("emp1");
		System.out.println(e1.getName());
		System.out.println(e1.getPhones());
		System.out.println(e1.getAddress());
		System.out.println(e1.getCourses());
		System.out.println(e1.getPhones().getClass().getName());
	}
}
