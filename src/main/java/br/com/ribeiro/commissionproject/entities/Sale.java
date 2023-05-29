package br.com.ribeiro.commissionproject.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sale")
public class Sale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double salesTax;
	private LocalDateTime instant;
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;
	@OneToMany(mappedBy = "id.sale")
	private List<SaleItem> items = new ArrayList<>();

	public Sale() {
	}

	public Sale(Long id, Double salesTax, LocalDateTime instant, Client client, Company company) {
		this.id = id;
		this.salesTax = salesTax;
		this.instant = instant;
		this.client = client;
		this.company = company;
	}
	
	public double getTotal() {
		double sum = 0.0;
		
		for(SaleItem item : items) {
			sum += item.getSubTotal();
		}
		return sum;
	}
	
	public double getCommissionForSystem() {
		return getTotal() * salesTax;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(Double salesTax) {
		this.salesTax = salesTax;
	}

	public LocalDateTime getInstant() {
		return instant;
	}

	public void setInstant(LocalDateTime instant) {
		this.instant = instant;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<SaleItem> getItems() {
		return items;
	}

	public void setItems(List<SaleItem> items) {
		this.items = items;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sale other = (Sale) obj;
		return Objects.equals(id, other.id);
	}

}
