package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Demo d1 = ctx.getBean("demo", Demo.class);
		System.out.println(d1);

//		SpelExpressionParser temp = new SpelExpressionParser();
//		Expression expression = temp.parseExpression("22+44");
//		System.out.println(expression.getValue());
	}
}
