package com.dev.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.demo.entity.Product;

/*
 * 
 * create restful API to manage Products
 */


@RestController
public class ProductRestService
{
	@Autowired
	private ProductRepository productRepository;
	
	
	@RequestMapping(value="/products",method=RequestMethod.GET)
	private Page<Product> listProduct(int page,int size)
	{ 
		return productRepository.findAll(new PageRequest(page,size));
	}
	
	@RequestMapping(value="/searchProducts",method=RequestMethod.GET)
	private Page<Product> searchProduct(String keyword,
			                            @RequestParam(name="page",defaultValue="0")int page,
			                            @RequestParam(name="size",defaultValue="5")int size)
	{ 
		return productRepository.searchProduct("%"+keyword+"%",new PageRequest(page, size));
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.GET)
	private Product getProduct(@PathVariable("id") Long id)
	{
		return productRepository.findOne(id);
	}
	
	@RequestMapping(value="/products",method=RequestMethod.POST)
	private Product saveProduct(@RequestBody Product p)
	{
		return productRepository.save(p);
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.PUT)
	private Product updateProduct(@RequestBody Product p,@PathVariable("id") Long id)
	{
		p.setId(id);
		return productRepository.saveAndFlush(p);
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.DELETE)
	private void deleteProduct(@PathVariable("id") Long id)
	{
		productRepository.delete(id);
		
	}
	
	

}
