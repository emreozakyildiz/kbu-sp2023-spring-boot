package com.recommender.recommendersystem.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private int marketID;
    private String marketName;
    @ManyToMany(mappedBy = "markets", fetch = FetchType.EAGER)
    private Set<Product> products;

    public Market() {
    }

    public Market(int marketID, String marketName, Set<Product> products) {
        this.marketID = marketID;
        this.marketName = marketName;
        this.products = products;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Market(int marketID, String marketName) {
        this.marketID = marketID;
        this.marketName = marketName;
    }

    public int getMarketID() {
        return marketID;
    }

    public void setMarketID(int marketID) {
        this.marketID = marketID;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }
}
