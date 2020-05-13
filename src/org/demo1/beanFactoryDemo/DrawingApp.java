package org.demo1.beanFactoryDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	public static void main(String [] args) {
		//Normal java approach
		/*Triangle triangle = new Triangle();
		triangle.draw();*/
		
		//Spring Approach
		//configuration file : BeanFactory will be a XML file
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle = (Triangle)factory.getBean("triangle");
		triangle.draw();
	}
}
