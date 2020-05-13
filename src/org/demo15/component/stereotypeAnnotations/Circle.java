package org.demo15.component.stereotypeAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Circle is now configured as a Spring bean
//added context:component-scan in spring2.xml
//@Component, @Controller, @Service, @Repository
@Component
public class Circle implements Shape{
	@Autowired
	private Point center;
	
	public void draw() {
		System.out.println("Point is: "+ center.getX()+ "," + center.getY());
	}
	
	
	public void setCenter(Point center) {
		this.center = center;
	}
	
	
	public Point getCenter() {
		return center;
	}

}
