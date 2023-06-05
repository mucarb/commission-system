package br.com.ribeiro.commissionproject.dto;

import br.com.ribeiro.commissionproject.entities.Product;
import br.com.ribeiro.commissionproject.projections.ProductMinProjection;

public class ProductMinDTO {

	private Long id;
	private String name;
	private Integer quantity;
	private Double price;
	
	public ProductMinDTO() {
	}

	public ProductMinDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		quantity = entity.getQuantity();
		price = entity.getPrice();
	}

	public ProductMinDTO(ProductMinProjection projection) {
		id = projection.getId();
		name = projection.getName();
		quantity = projection.getQuantity();
		price = projection.getPrice();
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
	
}
