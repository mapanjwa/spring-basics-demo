package org.demo10.lifecyclesCallback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Step 3: implements below 2 interfaces
/*disadvantage : implementing interfaces*/
public class Triangle implements InitializingBean,DisposableBean{

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
	
	/* Step 4: define below 2 methods for each interface
	 * 
	//Spring will call this method when all properties of bean are set.*/
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for Triangle");
	}
	//Spring will call this method before destroying the bean. i.e when application ends
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy method called for Triangle");
	}
	
	
	
}
