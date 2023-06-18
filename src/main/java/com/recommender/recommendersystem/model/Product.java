package com.recommender.recommendersystem.model;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @Column(updatable = false, nullable = false)
    private String productID;
    private int marketID;
    private String productName;
    private double productPrice;
    private double unitNumber;
    private double rating;
    private double productPrice1;
    private double productPrice2;
    private double productPrice3;
    private double productPrice4;
    private double productPrice5;

    public Product() {
    }

    public Product(String productID, int marketID, String productName, double productPrice, double unitNumber, double rating, double productPrice1, double productPrice2, double productPrice3, double productPrice4, double productPrice5) {
        this.productID = productID;
        this.marketID = marketID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.unitNumber = unitNumber;
        this.rating = rating;
        this.productPrice1 = productPrice1;
        this.productPrice2 = productPrice2;
        this.productPrice3 = productPrice3;
        this.productPrice4 = productPrice4;
        this.productPrice5 = productPrice5;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
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

    public double getProductPrice1() {
        return productPrice1;
    }

    public void setProductPrice1(double productPrice1) {
        this.productPrice1 = productPrice1;
    }

    public double getProductPrice2() {
        return productPrice2;
    }

    public void setProductPrice2(double productPrice2) {
        this.productPrice2 = productPrice2;
    }

    public double getProductPrice3() {
        return productPrice3;
    }

    public void setProductPrice3(double productPrice3) {
        this.productPrice3 = productPrice3;
    }

    public double getProductPrice4() {
        return productPrice4;
    }

    public void setProductPrice4(double productPrice4) {
        this.productPrice4 = productPrice4;
    }

    public double getProductPrice5() {
        return productPrice5;
    }

    public void setProductPrice5(double productPrice5) {
        this.productPrice5 = productPrice5;
    }
}