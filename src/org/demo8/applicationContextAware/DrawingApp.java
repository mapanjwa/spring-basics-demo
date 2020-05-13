package org.demo8.applicationContextAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String [] args) {
		/*if we want to use the same application context in the Triangle class (i.e the bean in this case)
		 * to provide the access of same context to other bean, 
		 * i.e wiring the bean with application Context instead of configuring in the spring1.xml file
		 * */
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		Triangle triangle = (Triangle)context.getBean("triangle_demo8");
		triangle.draw();
		
		//Triangle bean implements applicationContextAware
		//Hence we can get ApplicationContext anywhere in our code with the help of ApplicationContextAware.
		//No need to refer to the spring configuration file
		//Triangle can refer to any other bean with the help of ApplicationContextAware
		ApplicationContext appContext =triangle.getContext();
		ContretePage objContretePage = (ContretePage)appContext.getBean("testBean_demo8");
		objContretePage.doTask();
	}
}
