package org.demo8.applicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

	/*In spring we can get ApplicationContext anywhere in our code 
	 * with the help of ApplicationContextAware. 
	 * ApplicationContextAware is the interface and there is only one method.
	 * When a class in implementing ApplicationContextAware, 
	 * that class needs to override the method setApplicationContext. Find the example below.
	 * */
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println(getPointA().getX() + "," + getPointA().getY());
		System.out.println(getPointB().getX() + "," + getPointB().getY());
		System.out.println(getPointC().getX() + "," + getPointC().getY());
	}
	//unimplemented method of ApplicationContextAware
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
	}
	
	public ApplicationContext getContext() {
		return context;
	}
	
	//create a member variable
	private ApplicationContext context = null;

	//unimplemented name of BeanNameAware
	//Below method will be called before creating PointA,B,C beans from Triangle bean
	public void setBeanName(String beanName) {
		//un-comment while running it
		//System.out.println("Demo 8 Bean name is:"+ beanName);
	}
}
