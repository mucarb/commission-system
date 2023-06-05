package br.com.ribeiro.commissionproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ribeiro.commissionproject.dto.ProductDTO;
import br.com.ribeiro.commissionproject.dto.ProductMinDTO;
import br.com.ribeiro.commissionproject.entities.Product;
import br.com.ribeiro.commissionproject.projections.ProductMinProjection;
import br.com.ribeiro.commissionproject.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;

	@Transactional(readOnly = true)
	public List<ProductDTO> findAll() {
		List<Product> result = repo.findAll();
		return result.stream().map((x) -> new ProductDTO(x)).toList();
	}

	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {
		Product result = repo.findById(id).get();
		return new ProductDTO(result);
	}

	@Transactional(readOnly = true)
	public List<ProductMinDTO> findByCompany(Long companyId) {
		List<ProductMinProjection> result = repo.searchByCompany(companyId);
		return result.stream().map((x) -> new ProductMinDTO(x)).toList();
	}

}
