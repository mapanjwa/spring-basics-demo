package org.demo7.autowiring;

import org.demo7.autowiring.Point;

public class Triangle {
	/* ByName
	 * wiring automatically name of the bean is same as name of the member variable
	 * 	In this case, we can ask Spring to autowire based on name
	 * ie. property name === reference bean id
	 */
	
	/*byType
	 * this works when one bean defined in the xml of that particular type 
	 * Suppose there is a Point property present in the org.demo7.autowiring.Triangle class.
	 * autowire = "byType" will search a bean with 
	 * class = "org.demo7.autowiring.Point" in the xml
	 * This will work when the bean org.demo7.autowiring.Point is defined once.
	 * 
	 */
	
	/*constructor
	 * similar to autowire = "byType"
	 * but instead of setter injection, this require a constructor injection
	 * constructor have 3 different types and there is a single bean per type
	 * but condition here is that there should be one bean defined per type
	 * */
	private Point pointA_demo7;
	private Point pointB_demo7;
	private Point pointC_demo7;
	
	public Point getPointA_demo7() {
		return pointA_demo7;
	}
	public void setPointA_demo7(Point pointADemo7) {
		pointA_demo7 = pointADemo7;
	}
	public Point getPointB_demo7() {
		return pointB_demo7;
	}
	public void setPointB_demo7(Point pointBDemo7) {
		pointB_demo7 = pointBDemo7;
	}

	public Point getPointC_demo7() {
		return pointC_demo7;
	}

	public void setPointC_demo7(Point pointCDemo7) {
		pointC_demo7 = pointCDemo7;
	}
	
	public void draw() {
		System.out.println(getPointA_demo7().getX() + "," + getPointA_demo7().getY());
		System.out.println(getPointB_demo7().getX() + "," + getPointB_demo7().getY());
		System.out.println(getPointC_demo7().getX() + "," + getPointC_demo7().getY());
	}
}
