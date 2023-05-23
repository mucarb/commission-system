package br.com.ribeiro.commissionproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.ribeiro.commissionproject.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;

	@Bean
	boolean instantiateDatabase() {
		dbService.instantiateTestDatabase();
		return true;
	}

}
