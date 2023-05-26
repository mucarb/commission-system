package br.com.ribeiro.commissionproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ribeiro.commissionproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
