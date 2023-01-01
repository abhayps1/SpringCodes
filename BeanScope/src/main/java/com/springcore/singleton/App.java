package com.springcore.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/singleton/singletonconfig.xml");
		Student s1 = ctx.getBean("student", Student.class);
		System.out.println(s1);

		System.out.println(s1.hashCode());

		Student s2 = ctx.getBean("student", Student.class);
		System.out.println(s2);

		System.out.println(s2.hashCode());

	}
}
