package org.example.spring__mvc.repository;
import org.example.spring__mvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long > {

}
