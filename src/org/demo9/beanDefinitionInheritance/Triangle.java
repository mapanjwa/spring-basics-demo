package org.demo9.beanDefinitionInheritance;

import java.util.List;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private List<Point> pointsArray; 
	
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
		System.out.println("------------------------");
		System.out.println(getPointA().getX() + "," + getPointA().getY());
		System.out.println(getPointB().getX() + "," + getPointB().getY());
		System.out.println(getPointC().getX() + "," + getPointC().getY());
		
		System.out.println("List values:");
		for (Point point : pointsArray) {
			System.out.print(point.getX()+ " " + point.getY());
			System.out.println();
		}
		System.out.println("------------------------");
	}
	public void setPointsArray(List<Point> pointsArray) {
		this.pointsArray = pointsArray;
	}
	public List<Point> getPointsArray() {
		return pointsArray;
	}
}
