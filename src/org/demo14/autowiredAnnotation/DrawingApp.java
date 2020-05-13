package org.demo14.autowiredAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String [] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		
		//below are required to destroy the application in the end
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		//to destroy the application
		context.registerShutdownHook();
		
		Shape shape = (Circle)context.getBean("circle_demo14");
		shape.draw();
	}
}
