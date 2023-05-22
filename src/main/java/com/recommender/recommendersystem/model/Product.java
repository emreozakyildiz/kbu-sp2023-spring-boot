package com.recommender.recommendersystem.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Product {

    @Id
    @Column(updatable = false, nullable = false)
    private String productID;
    private int marketID;
    private String productName;
    private double productPrice;
    private double unitNumber;

    public Product() {
    }

    public Product(String productID, int marketID, String productName, double productPrice, double unitNumber) {
        this.productID = productID;
        this.marketID = marketID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.unitNumber = unitNumber;
    }

    public int getMarketID() {
        return marketID;
    }

    public void setMarketID(int marketID) {
        this.marketID = marketID;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(double unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}