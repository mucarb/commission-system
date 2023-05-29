package br.com.ribeiro.commissionproject.entities;

import java.util.ArrayList;
import java.util.List;

import br.com.ribeiro.commissionproject.entities.enums.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_company")
public class Company extends User {
	private static final long serialVersionUID = 1L;

	private String cnpj;
	private Double tax;
	private Double balance;
	@OneToMany(mappedBy = "company")
	private List<Product> products = new ArrayList<>();
	@OneToMany(mappedBy = "company")
	private List<Sale> sales = new ArrayList<>();

	public Company() {
	}

	public Company(Long id, String name, String username, String password, String cnpj, Double tax, Double balance) {
		super(id, name, username, password, UserType.COMPANY);
		this.cnpj = cnpj;
		this.tax = tax;
		this.balance = balance;
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

	public List<Product> getProducts() {
		return products;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

}
