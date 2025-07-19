package com.sb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "company")
@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cname;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(Long id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}

	
	
	
}
