package org.demo15.component.stereotypeAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Triangle is now configured as a Spring bean
//added context:component-scan in spring2.xml
@Component
public class Triangle implements Shape{

	@Autowired
	private Point pointA;
	@Autowired
	private Point pointB;
	@Autowired
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
}
