package com.dev.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dev.demo.dao.ProductRepository;
import com.dev.demo.entity.Product;

@SpringBootApplication
public class ADevWebMvcAngularApplication implements CommandLineRunner
{
	@Autowired
	private ProductRepository repo;

	public static void main(String[] args)
	{
		
	    SpringApplication.run(ADevWebMvcAngularApplication.class, args);
	   
	}

	@Override
	public void run(String... arg0) throws Exception
	{
		    /*//ProductRepository repo=ctxt.getBean(ProductRepository.class);
		    repo.save(new Product("HMT",30000,5));
		    repo.save(new Product("Sony",24000,3));
		    repo.save(new Product("HMT",92000,7));
		    
		    
		   List<Product> listAll=repo.findAll();
		   listAll.forEach( p -> System.out.println(p.getId()+" "+p.getDesignation()+" "+p.getPrice()+" "+p.getQuantity())); 
		   */
		
	}
}
