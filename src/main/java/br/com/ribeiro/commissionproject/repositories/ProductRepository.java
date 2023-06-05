package br.com.ribeiro.commissionproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.ribeiro.commissionproject.entities.Product;
import br.com.ribeiro.commissionproject.projections.ProductMinProjection;

public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query(nativeQuery = true, value = """
			SELECT tb_product.id, tb_product.name, tb_product.quantity, tb_product.price
			FROM  tb_product
			INNER JOIN tb_company ON tb_company.id = tb_product.company_id
			WHERE tb_company.id = :companyId
			ORDER BY tb_product.name ASC
			""")
	List<ProductMinProjection> searchByCompany(Long companyId);

}
