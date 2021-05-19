package com.app.test.SpringBootMySqlApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="login")
@Data
public class Ticket {

	@Id
	@GeneratedValue
    
	private int id;
	private String username;
	private String password;
	
	
}



