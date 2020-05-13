package org.demo17.eventHandling;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class DrawEvent extends ApplicationEvent{

	public DrawEvent(Object source) {
		super(source);
	}

	public String toString() {
		return "User defined : Draw event occurred";
	}
}
