package br.com.ribeiro.commissionproject.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.ribeiro.commissionproject.entities.enums.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_client")
public class Client extends User {
	private static final long serialVersionUID = 1L;

	private String cpf;
	private LocalDate birthDate;
	@OneToMany(mappedBy = "client")
	private List<Sale> sales = new ArrayList<>();

	public Client() {
	}

	public Client(Long id, String name, String username, String password, String cpf, LocalDate birthDate) {
		super(id, name, username, password, UserType.CLIENT);
		this.cpf = cpf;
		this.birthDate = birthDate;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public List<Sale> getSales() {
		return sales;
	}

	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}

}
