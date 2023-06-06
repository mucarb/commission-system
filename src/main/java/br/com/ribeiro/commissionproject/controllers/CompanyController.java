package br.com.ribeiro.commissionproject.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.ribeiro.commissionproject.dto.CompanyDTO;
import br.com.ribeiro.commissionproject.dto.CompanyNewDTO;
import br.com.ribeiro.commissionproject.dto.ProductMinDTO;
import br.com.ribeiro.commissionproject.entities.Company;
import br.com.ribeiro.commissionproject.services.CompanyService;
import br.com.ribeiro.commissionproject.services.ProductService;

@RestController
@RequestMapping(value = "/companies")
public class CompanyController {

	@Autowired
	private CompanyService service;

	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseEntity<List<CompanyDTO>> findAll() {
		List<CompanyDTO> result = service.findAll();
		return ResponseEntity.ok().body(result);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<CompanyDTO> findById(@PathVariable Long id) {
		CompanyDTO result = service.findById(id);
		return ResponseEntity.ok().body(result);
	}

	@GetMapping(value = "/{companyId}/products")
	public ResponseEntity<List<ProductMinDTO>> findByCompany(@PathVariable Long companyId) {
		List<ProductMinDTO> result = productService.findByCompany(companyId);
		return ResponseEntity.ok().body(result);
	}

	@PostMapping
	public ResponseEntity<ProductMinDTO> create(@RequestBody CompanyNewDTO objNewDTO) {
		Company obj = service.create(objNewDTO);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

}
