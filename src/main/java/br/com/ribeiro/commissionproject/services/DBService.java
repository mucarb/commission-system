package br.com.ribeiro.commissionproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ribeiro.commissionproject.entities.User;
import br.com.ribeiro.commissionproject.repositories.UserRepository;

@Service
public class DBService {

	@Autowired
	private UserRepository userRepository;

	public void instantiateTestDatabase() {
		User u1 = new User(null, "Rodrigo Alves", "rd.alves", "123456");
		userRepository.save(u1);
	}

}
