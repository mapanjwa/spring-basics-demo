package org.demo6.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		Triangle triangle = (Triangle)context.getBean("triangle_demo6");
		triangle.draw();
		
	}
}
