package com.dev.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.demo.entity.Categorie;


/*
 * 
 * Expose the methods of the JPA Repository interface to a Rest API by 
 * using Data Rest---@RepositoryRestResource--n service 
   and controller layer need for categorie
 */

@RepositoryRestResource   //based on spring data 
public interface CategorieRepository extends JpaRepository<Categorie,Long>
{
	

}
