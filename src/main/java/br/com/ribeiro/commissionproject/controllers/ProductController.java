package br.com.ribeiro.commissionproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ribeiro.commissionproject.dto.ProductDTO;
import br.com.ribeiro.commissionproject.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<ProductDTO>> findAll(){
		List<ProductDTO> result = service.findAll();
		return ResponseEntity.ok().body(result);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProductDTO> findById(@PathVariable Long id){
		ProductDTO result = service.findById(id);
		return ResponseEntity.ok().body(result);
	}
	
}
