package com.recommender.recommendersystem.repository;

import com.recommender.recommendersystem.model.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MarketRepository extends JpaRepository<Market,String> {
    @Query("SELECT DISTINCT m FROM Market m LEFT JOIN FETCH m.products")
    List<Market> findAllWithProducts();
}
