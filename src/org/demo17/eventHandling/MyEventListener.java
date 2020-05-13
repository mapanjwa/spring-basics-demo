package org.demo17.eventHandling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener{
	//This is called when application event is published/executed
	//event can be user defined or framework related event
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event.toString());
	}

}
