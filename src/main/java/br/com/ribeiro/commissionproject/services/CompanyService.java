package br.com.ribeiro.commissionproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ribeiro.commissionproject.dto.CompanyMinDTO;
import br.com.ribeiro.commissionproject.entities.Company;
import br.com.ribeiro.commissionproject.repositories.CompanyRepositoy;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepositoy repo;

	public List<CompanyMinDTO> findAll() {
		List<Company> result = repo.findAll();
		return result.stream().map(x -> new CompanyMinDTO(x)).toList();
	}

	public CompanyMinDTO findById(Long id) {
		Company result = repo.findById(id).get();
		return new CompanyMinDTO(result);
	}
	
}
