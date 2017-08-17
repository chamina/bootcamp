package com.krishantha.eventManager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.krishantha.eventManager.model.Event;
import com.krishantha.eventManager.model.EventType;
import com.krishantha.eventManager.repository.EventRepository;

@Service(value ="eventService")
public class EventServiceImpl implements EventService{

	@Autowired
	EventRepository repository;
	
	
	public List<EventType> getAllEventTypes() {
		
		List<EventType> eventTypes = new ArrayList<EventType>();
		EventType eventType= new EventType();
		eventType.setEventType("wedding");
		eventTypes.add(eventType);
		
		eventType= new EventType();
		eventType.setEventType("Birthday");
		eventTypes.add(eventType);
		
		eventType= new EventType();
		eventType.setEventType("Good bye");
		eventTypes.add(eventType);
		
		eventType= new EventType();
		eventType.setEventType("First Salary");
		eventTypes.add(eventType);
		
		eventType= new EventType();
		eventType.setEventType("Anniversorry");
		eventTypes.add(eventType);
		
		return eventTypes;
		
		
	}
	
	@Transactional
	public Event save(Event event){
		
		repository.save(event);

		return event;
	}

	

	
	

}
