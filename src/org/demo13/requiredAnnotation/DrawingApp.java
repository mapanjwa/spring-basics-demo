package org.demo13.requiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String [] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		Shape shape = (Triangle)context.getBean("triangle_demo13");
		shape.draw();
		
		shape = (Circle)context.getBean("circle_demo13");
		shape.draw();
	}
}
