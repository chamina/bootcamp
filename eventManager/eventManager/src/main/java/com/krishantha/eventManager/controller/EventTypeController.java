package com.krishantha.eventManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishantha.eventManager.model.EventType;
import com.krishantha.eventManager.service.EventService;

import antlr.debug.Event;

@RestController
public class EventTypeController {
	@Autowired
	EventService eventService;
	
	@RequestMapping(value="getEventTypes")
		public List<EventType> geEventTypes(){
		
		return eventService.getAllEventTypes();
	}
	
	public Event save(Event event){
		return null;
	}

}


