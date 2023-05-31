package br.com.ribeiro.commissionproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ribeiro.commissionproject.entities.Company;

public interface CompanyRepositoy extends JpaRepository<Company, Long> {

}
