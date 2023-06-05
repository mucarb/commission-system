package br.com.ribeiro.commissionproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ribeiro.commissionproject.dto.ProductDTO;
import br.com.ribeiro.commissionproject.entities.Product;
import br.com.ribeiro.commissionproject.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;

	public List<ProductDTO> findAll() {
		List<Product> result = repo.findAll();
		return result.stream().map(x -> new ProductDTO(x)).toList();
	}

	public ProductDTO findById(Long id) {
		Product result = repo.findById(id).get();
		return new ProductDTO(result);
	}
	
}
