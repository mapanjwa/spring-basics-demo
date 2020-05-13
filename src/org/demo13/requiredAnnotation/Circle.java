package org.demo13.requiredAnnotation;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{

	private Point center;
	
	public void draw() {
		System.out.println("Point is: "+ center.getX()+ "," + center.getY());
	}

	/* @Required annotation will make sure that the field center is set 
	 * before running running the application.
	 * Spring Provides the BeanPostProcessor which needs to be defined in the configuration file
	 *  "RequiredAnnotationBeanPostProcessor"
	 * if this dependency is not met, then exception will be thrown by Spring instead of 
	 * throwing null pointer exception when the application runs.
	 * */
	
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}

	public Point getCenter() {
		return center;
	}

}
