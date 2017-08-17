package com.krishantha.eventManager.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Generated;

@Entity
@Table(name="event")
public class Event {
	
	
	
	@Id
	@GeneratedValue 
	@Column(name="eventID")
	private int id;

	@Size(min=5, max=10, message="Event name should between 5 and 10 characters")
	private String eventName;
	
	String eventType;
	
	@OneToMany(mappedBy="event",cascade={CascadeType.ALL})
	List<Activity> activities=new ArrayList();

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	
	
}
