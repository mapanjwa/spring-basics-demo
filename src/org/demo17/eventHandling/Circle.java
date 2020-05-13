package org.demo17.eventHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

//Circle is now configured as a Spring bean
//added context:component-scan in spring2.xml
//@Component, @Controller, @Service, @Repository
@Component
public class Circle implements Shape, ApplicationEventPublisherAware {
	@Autowired
	private Point center;
	
	@Autowired
	private MessageSource messageSouce;
	
	//In order to handle this local member variable to the event, 
	//implement ApplicationEventPublisherAware
	//and handle method of the interface
	private ApplicationEventPublisher publisher; 
	
	public void draw() {
		System.out.println(this.messageSouce.getMessage("drawing.circle", null, "default drawing Message",null));
		System.out.println(this.messageSouce.getMessage
					("drawing.point", new Object[] {center.getX(),center.getY()}, "default Point Message",null));
		
		//Step 1: creating an event
		DrawEvent myEvent = new DrawEvent(this);
		//Step 2: Publishing an event to the member variable
		publisher.publishEvent(myEvent);
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

	//unimplemented method of interface ApplicationEventPublisherAware
	//Step 3: to provide the event to ApplicationEventPublisher from the member variable
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher; 
	}
}
