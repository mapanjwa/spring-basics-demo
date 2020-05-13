package org.demo16.messageSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String [] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringDemo16.xml");
		Shape shape = (Triangle)context.getBean("triangle");
		shape.draw();
		
		shape = (Circle)context.getBean("circle");
		shape.draw();
		
		//display message source.
		//Applicable only with ApplicationContext. not with BeanFactory
		System.out.println(context.getMessage
				("greeting", null, "This is a default greeting Message",null));
	}
}