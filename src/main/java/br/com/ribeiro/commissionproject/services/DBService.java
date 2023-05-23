package br.com.ribeiro.commissionproject.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ribeiro.commissionproject.entities.Company;
import br.com.ribeiro.commissionproject.entities.User;
import br.com.ribeiro.commissionproject.repositories.UserRepository;

@Service
public class DBService {

	@Autowired
	private UserRepository userRepository;

	public void instantiateTestDatabase() {
		User u1 = new User(null, "Rodrigo Alves", "admin.alves", "123456");
		User co1 = new Company(null, "Skills Informática", "s&a_ltda", "090807", "76569233000171", 0.19, 0.0);
		User co2 = new Company(null, "Medida Certa Ltda.", "na_medida", "009988", "67292330000179", 0.15, 0.0);
		User co3 = new Company(null, "Strong Coffee", "coffee", "090909", "00717582000121", 0.10, 0.0);
		userRepository.saveAll(Arrays.asList(u1, co1, co2, co3));
	}

}
