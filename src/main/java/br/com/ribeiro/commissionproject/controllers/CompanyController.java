package br.com.ribeiro.commissionproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ribeiro.commissionproject.dto.CompanyMinDTO;
import br.com.ribeiro.commissionproject.services.CompanyService;

@RestController
@RequestMapping(value = "/companies")
public class CompanyController {
	
	@Autowired
	private CompanyService service;
	
	@GetMapping
	public ResponseEntity<List<CompanyMinDTO>> findAll(){
		List<CompanyMinDTO> result = service.findAll();
		return ResponseEntity.ok().body(result);
	}
	
}
