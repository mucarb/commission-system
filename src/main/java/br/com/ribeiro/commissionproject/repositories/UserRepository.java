package br.com.ribeiro.commissionproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ribeiro.commissionproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
