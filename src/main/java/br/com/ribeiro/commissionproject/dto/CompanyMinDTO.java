package br.com.ribeiro.commissionproject.dto;

import br.com.ribeiro.commissionproject.entities.Company;

public class CompanyMinDTO {

	private Long id;
	private String name;
	private Integer type;
	private String cnpj;
	private Double tax;
	private Double balance;
	
	public CompanyMinDTO() {
	}
	
	public CompanyMinDTO(Company entity) {
		id = entity.getId();
		name = entity.getName();
		type = entity.getType().getCod();
		cnpj = entity.getCnpj();
		tax = entity.getTax();
		balance = entity.getBalance();
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

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
}
