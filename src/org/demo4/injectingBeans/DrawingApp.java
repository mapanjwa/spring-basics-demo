package org.demo4.injectingBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String [] args) {
		
		/*Normal java approach
		create 3 instances of Point object and assign it to Triangle object
		triangle.draw();*/
		
		//Spring Approach
		//configuration file : ApplcationContext will be a XML file in a same classpath
		//i.e. in the src folder. Not at the project level
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		Triangle triangle = (Triangle)context.getBean("triangle_demo4");
		triangle.draw();
		
	}
}
