package com.recommender.recommendersystem.model;

import jakarta.persistence.*;

@Entity
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private int marketID;
    private String marketName;

    public Market() {
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
