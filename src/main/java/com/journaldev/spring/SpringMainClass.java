package com.journaldev.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.journaldev.spring");
		context.refresh();

		MathComponent ms = context.getBean(MathComponent.class);

		int result = ms.add(1, 2);
		System.out.println("Addition of 1 and 2 = " + result);

		ms = (MathComponent) context.getBean("mc");

		result = ms.add(5, 7);
		System.out.println("Addition of 5 and 7 = " + result);

		context.close();
	}
}