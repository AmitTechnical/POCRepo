package com.app.test.SpringBootMySqlApp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.test.SpringBootMySqlApp.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

	

	
}
