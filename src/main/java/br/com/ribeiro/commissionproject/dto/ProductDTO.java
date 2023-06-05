package br.com.ribeiro.commissionproject.dto;

import br.com.ribeiro.commissionproject.entities.Product;

public class ProductDTO {

	private Long id;
	private String name;
	private Integer quantity;
	private Double price;
	private CompanyMinDTO company;
	
	public ProductDTO() {
	}

	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		quantity = entity.getQuantity();
		price = entity.getPrice();
		company = new CompanyMinDTO(entity.getCompany()); 
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public CompanyMinDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyMinDTO company) {
		this.company = company;
	}
	
}
