package com.recommender.recommendersystem.repository;

import com.recommender.recommendersystem.model.Market;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketRepository extends JpaRepository<Market,String> {
}
