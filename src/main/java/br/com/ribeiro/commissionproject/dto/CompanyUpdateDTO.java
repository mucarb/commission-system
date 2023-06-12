package br.com.ribeiro.commissionproject.dto;

import br.com.ribeiro.commissionproject.entities.Company;

public class CompanyUpdateDTO {

	private Long id;
	private String name;
	private String username;
	private String password;
	private String cnpj;

	public CompanyUpdateDTO() {
	}

	public CompanyUpdateDTO(Company entity) {
		id = entity.getId();
		name = entity.getName();
		username = entity.getUsername();
		password = entity.getPassword();
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
