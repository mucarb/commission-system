package br.com.ribeiro.commissionproject.entities;

import java.time.LocalDate;

import br.com.ribeiro.commissionproject.entities.enums.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_client")
public class Client extends User {
	private static final long serialVersionUID = 1L;

	private String cpf;
	private LocalDate birthDate;

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

}
