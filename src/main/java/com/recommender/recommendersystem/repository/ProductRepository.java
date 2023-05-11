package com.recommender.recommendersystem.repository;

import com.recommender.recommendersystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository <Product, String> {

}
