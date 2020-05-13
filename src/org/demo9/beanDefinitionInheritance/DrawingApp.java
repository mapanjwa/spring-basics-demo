package org.demo9.beanDefinitionInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		Triangle triangle = (Triangle)context.getBean("triangle1_demo9");
		triangle.draw();
		
		Triangle triangle2 = (Triangle)context.getBean("triangle2_demo9");
		triangle2.draw();
		
		Triangle triangle3 = (Triangle)context.getBean("triangle3_demo9");
		triangle3.draw();
	}
}
