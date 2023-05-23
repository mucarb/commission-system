package br.com.ribeiro.commissionproject.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ribeiro.commissionproject.entities.Client;
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
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		User cl1 = new Client(null, "Helena Silva", "helena_s", "121212", "16388560016",
				LocalDate.parse("17/05/1995", formatter));
		User cl2 = new Client(null, "Alberto Junior", "junior_ab", "121314", "49299125040",
				LocalDate.parse("04/07/2000", formatter));
		userRepository.saveAll(Arrays.asList(u1, co1, co2, co3, cl1, cl2));
	}

}
