package br.com.ribeiro.commissionproject.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sale_item")
public class SaleItem {

	@EmbeddedId
	private SaleItemPK id = new SaleItemPK();
	private Integer quantity;
	private Double price;

	public SaleItem() {
	}

	public SaleItem(Sale sale, Product product, Integer quantity, Double price) {
		id.setSale(sale);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}
	
	public double getSubTotal() {
		return price * quantity;
	}

	public Sale getSale() {
		return id.getSale();
	}

	public void setSale(Sale sale) {
		id.setSale(sale);
	}

	public Product getProduct() {
		return id.getProduct();
	}

	public void setProduct(Product product) {
		id.setProduct(product);
	}

	public SaleItemPK getId() {
		return id;
	}

	public void setId(SaleItemPK id) {
		this.id = id;
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
