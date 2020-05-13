package org.demo3.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String [] args) {
		//Normal java approach
		/*Triangle triangle = new Triangle();
		triangle.draw();*/
		
		//Spring Approach
		//configuration file : ApplcationContext will be a XML file in a same classpath
		//i.e. in the src folder. Not at the project level
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		Triangle triangle = (Triangle)context.getBean("triangle_ConstructorInjection");
		triangle.draw();
		System.out.println("Type is :" + triangle.getType() 
				+ "of height :" + triangle.getHeight());
	}
}
