package org.demo14.autowiredAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;


public class Circle implements Shape{

	private Point center;
	
	public void draw() {
		System.out.println("Point is: "+ center.getX()+ "," + center.getY());
	}
	
	@Autowired
	public void setCenter(Point center) {
		this.center = center;
	}

	/*
	----OR----
	JSR 250 annotation
	@Resource(name="center_demo14")
	public void setCenter(Point center) {
		this.center = center;
	}
	*/
	
	public Point getCenter() {
		return center;
	}

	//JSR 250 annotation : similar to InitializingBean
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of circle");
	}
	
	//JSR 250 annotation : similar to DisposableBean
	@PreDestroy
	public void destroyCircle() {
		System.out.println("destroy of circle");
	}
}
