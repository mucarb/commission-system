package br.com.ribeiro.commissionproject.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ribeiro.commissionproject.entities.Client;
import br.com.ribeiro.commissionproject.entities.Company;
import br.com.ribeiro.commissionproject.entities.Product;
import br.com.ribeiro.commissionproject.entities.User;
import br.com.ribeiro.commissionproject.repositories.ProductRepository;
import br.com.ribeiro.commissionproject.repositories.UserRepository;

@Service
public class DBService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ProductRepository productRepository;

	public void instantiateTestDatabase() {
		User u1 = new User(null, "Rodrigo Alves", "admin.alves", "123456");
		Company co1 = new Company(null, "Skills Informática", "s&a_ltda", "090807", "76569233000171", 0.19, 0.0);
		Company co2 = new Company(null, "Medida Certa Ltda.", "na_medida", "009988", "67292330000179", 0.15, 0.0);
		Company co3 = new Company(null, "Strong Coffee", "coffee", "090909", "00717582000121", 0.10, 0.0);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Client cl1 = new Client(null, "Helena Silva", "helena_s", "121212", "16388560016",
				LocalDate.parse("17/05/1995", formatter));
		Client cl2 = new Client(null, "Alberto Junior", "junior_ab", "121314", "49299125040",
				LocalDate.parse("04/07/2000", formatter));
		userRepository.saveAll(Arrays.asList(u1, co1, co2, co3, cl1, cl2));

		Product pr1 = new Product(null, "Monitor '24 polegadas, 75 Hz", 5, 859.9, co1);
		Product pr2 = new Product(null, "Memória RAM 8GB 3200Mhz DDR4", 6, 150.0, co1);
		Product pr3 = new Product(null, "HD SSD 500GB", 2, 170.0, co1);
		Product pr4 = new Product(null, "Tênis adidas", 4, 128.9, co2);
		Product pr5 = new Product(null, "Calça jogger masculina", 11, 70.0, co2);
		Product pr6 = new Product(null, "Esfirra de frando e cheddar", 6, 5.0, co3);
		Product pr7 = new Product(null, "Pepsi Cola 330ml", 3, 3.5, co3);
		Product pr8 = new Product(null, "Café Expresso", 10, 2.5, co3);
		productRepository.saveAll(Arrays.asList(pr1, pr2, pr3, pr4, pr5, pr6, pr7, pr8));
	}

}
