package org.demo11.beanFactoryPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String [] args) {
		/*Note: un-comment the line
		 * <bean class="common.DisplayNameBeanPostProcessor"/>
		 * to understand the concept of BeanPostProcessor.
		 * the corresponding class is written in common.DisplayNameBeanPostProcessor
		 * This is will run before and after all the beans initialization
		 * */
		
		//my customized BeanFactoryPostProcessor : MyBeanFacortPP
		//BeanFactoryPostProcessor provided by Spring : PropertyPlaceHolderConfiger
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		Triangle triangle = (Triangle)context.getBean("triangle_demo11");
		triangle.draw();	
	}
}
