package com.recommender.recommendersystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @Column(updatable = false, nullable = false)
    private String productID;
    private String marketID;
    private String productName;
    private double productPrice;
    private double unitNumber;

    public Product() {
    }

    public Product(String productID, String marketID, String productName, double productPrice, double unitNumber) {
        this.productID = productID;
        this.marketID = marketID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.unitNumber = unitNumber;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getMarketID() {
        return marketID;
    }

    public void setMarketID(String marketID) {
        this.marketID = marketID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
}
