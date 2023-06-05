package br.com.ribeiro.commissionproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ribeiro.commissionproject.dto.CompanyDTO;
import br.com.ribeiro.commissionproject.entities.Company;
import br.com.ribeiro.commissionproject.repositories.CompanyRepositoy;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepositoy repo;

	public List<CompanyDTO> findAll() {
		List<Company> result = repo.findAll();
		return result.stream().map(x -> new CompanyDTO(x)).toList();
	}

	public CompanyDTO findById(Long id) {
		Company result = repo.findById(id).get();
		return new CompanyDTO(result);
	}
	
}
