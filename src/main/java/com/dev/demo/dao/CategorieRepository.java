package com.dev.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.demo.entity.Categorie;


@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie,Long>
{
	

}
