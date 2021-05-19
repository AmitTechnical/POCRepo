package com.app.test.SpringBootMySqlApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.test.SpringBootMySqlApp.dao.TicketDao;
import com.app.test.SpringBootMySqlApp.model.Ticket;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class TicketController {

	@Autowired
	private TicketDao dao;

	@PostMapping("/doLogin")
	public String doLogin(@RequestBody Ticket tickets) {
	dao.save(tickets);
		
		
		//return "Login Successfull" + tickets.size();
	
	return "Login Successfully" ;

	}
	
	@GetMapping("/getLogin")
	public List<Ticket> getTickets(){
		return  (List<Ticket>) dao.findAll();
		
	}
	
	@GetMapping("/getLogin/{id}")
	public Optional<Ticket> getTicketById(@PathVariable int id){
		return dao.findById(id);
	}
}
