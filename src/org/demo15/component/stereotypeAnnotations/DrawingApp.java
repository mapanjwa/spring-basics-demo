package org.demo15.component.stereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String [] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringDemo15.xml");
		Shape shape = (Triangle)context.getBean("triangle");
		shape.draw();
		
		shape = (Circle)context.getBean("circle");
		shape.draw();
	}
}
