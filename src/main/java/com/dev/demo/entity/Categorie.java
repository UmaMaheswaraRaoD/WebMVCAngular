package com.dev.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Categorie implements Serializable
{
	
	@Id @GeneratedValue
	private Long id;
	private String nameCatgeorie;
	
	public Categorie() {
		// TODO Auto-generated constructor stub
	}
	
	public Categorie(String nameCatgeorie) {
		super();
		this.nameCatgeorie = nameCatgeorie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameCatgeorie() {
		return nameCatgeorie;
	}

	public void setNameCatgeorie(String nameCatgeorie) {
		this.nameCatgeorie = nameCatgeorie;
	}
	
	
	
	
	

}
