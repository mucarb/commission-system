package br.com.ribeiro.commissionproject.dto;

import br.com.ribeiro.commissionproject.entities.Company;

public class CompanyNewDTO {

	private Long id;
	private String name;
	private String username;
	private String password;
	private Integer type;
	private String cnpj;
	private Double tax;

	public CompanyNewDTO() {
	}

	public CompanyNewDTO(Company entity) {
		id = entity.getId();
		name = entity.getName();
		username = entity.getUsername();
		password = entity.getPassword();
		type = entity.getType().getCod();
		cnpj = entity.getCnpj();
		tax = entity.getTax();
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

}
