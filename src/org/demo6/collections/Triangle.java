package org.demo6.collections;

import java.util.List;

public class Triangle {
	//List, Set and Map are supported
	//below is the demo of List
	private List<Point> points;
	
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public List<Point> getPoints() {
		return points;
	}
	
	public void draw() {
		for (Point p : points) {
			System.out.println(p.getX() + "," + p.getY());
		}
	}
}
