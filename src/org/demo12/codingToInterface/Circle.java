package org.demo12.codingToInterface;


public class Circle implements Shape{

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
