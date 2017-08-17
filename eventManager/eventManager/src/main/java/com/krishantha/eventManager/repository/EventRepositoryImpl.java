package com.krishantha.eventManager.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.krishantha.eventManager.model.Event;

@Repository(value ="eventRepository")
public class EventRepositoryImpl implements EventRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	public Event save(Event event ) {

		entityManager.persist(event);
		entityManager.flush();
		return event;
	}
	

	
}
