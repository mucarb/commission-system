package br.com.ribeiro.commissionproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ribeiro.commissionproject.entities.SaleItem;

public interface SaleItemRepository extends JpaRepository<SaleItem, Long> {

}
