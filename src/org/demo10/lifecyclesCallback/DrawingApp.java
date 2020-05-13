package org.demo10.lifecyclesCallback;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String [] args) {
		
		//step 1:
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		//step 2: 
		context.registerShutdownHook();
		
		//way 1: implementing interfaces InitializingBean,DisposableBean
		//Triangle triangle = (Triangle)context.getBean("triangle_demo10");
		//triangle.draw();
		
		//way2: using Spring configuration file
		//Triangle2 triangle2 = (Triangle2)context.getBean("triangle2_demo10");
		//triangle2.draw();
		
		//combining way 1 and way 2
		Triangle3 triangle3 = (Triangle3)context.getBean("triangle3_demo10");
		triangle3.draw();
	}
}
