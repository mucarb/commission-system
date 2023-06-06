package br.com.ribeiro.commissionproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ribeiro.commissionproject.dto.CompanyDTO;
import br.com.ribeiro.commissionproject.dto.CompanyNewDTO;
import br.com.ribeiro.commissionproject.entities.Company;
import br.com.ribeiro.commissionproject.repositories.CompanyRepositoy;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepositoy repo;

	@Transactional(readOnly = true)
	public List<CompanyDTO> findAll() {
		List<Company> result = repo.findAll();
		return result.stream().map(x -> new CompanyDTO(x)).toList();
	}

	@Transactional(readOnly = true)
	public CompanyDTO findById(Long id) {
		Company result = repo.findById(id).get();
		return new CompanyDTO(result);
	}

	public Company create(CompanyNewDTO objNewDTO) {
		objNewDTO.setId(null);
		Company obj = fromDTO(objNewDTO);
		return repo.save(obj);
	}

	public Company fromDTO(CompanyNewDTO objDTO) {
		return new Company(objDTO.getId(), objDTO.getName(), objDTO.getUsername(), objDTO.getPassword(),
				objDTO.getCnpj(), objDTO.getTax(), null);
	}

}
