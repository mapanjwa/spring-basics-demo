package org.demo16.messageSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

//Circle is now configured as a Spring bean
//added context:component-scan in spring2.xml
//@Component, @Controller, @Service, @Repository
@Component
public class Circle implements Shape{
	@Autowired
	private Point center;
	
	@Autowired
	private MessageSource messageSouce;
	
	public void draw() {
		System.out.println(this.messageSouce.getMessage("drawing.circle", null, "default drawing Message",null));
		System.out.println(this.messageSouce.getMessage
					("drawing.point", new Object[] {center.getX(),center.getY()}, "default Point Message",null));
		//System.out.println(this.messageSouce.getMessage("greeting", null, "default greeting Message",null));
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public Point getCenter() {
		return center;
	}

	public void setMessageSouce(MessageSource messageSouce) {
		this.messageSouce = messageSouce;
	}

	public MessageSource getMessageSouce() {
		return messageSouce;
	}

}
