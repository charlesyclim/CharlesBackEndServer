package com.charlesyclim.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="wallet")
public class Wallet implements Serializable {
	
	private static final long serialVersionUID = -2810150677574812090L;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	private String name;

}
