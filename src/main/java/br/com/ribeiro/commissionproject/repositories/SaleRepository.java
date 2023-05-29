package br.com.ribeiro.commissionproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ribeiro.commissionproject.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
