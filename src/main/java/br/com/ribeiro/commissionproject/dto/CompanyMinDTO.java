package br.com.ribeiro.commissionproject.dto;

import br.com.ribeiro.commissionproject.entities.Company;

public class CompanyMinDTO {

	private Long id;
	private String name;
	private String cnpj;
	
	public CompanyMinDTO() {
	}
	
	public CompanyMinDTO(Company entity) {
		id = entity.getId();
		name = entity.getName();
		cnpj = entity.getCnpj();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
