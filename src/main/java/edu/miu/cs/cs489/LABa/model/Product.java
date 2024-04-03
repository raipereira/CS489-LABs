package edu.miu.cs.cs489.LABa.model;

import java.time.LocalDate;
import java.util.List;

public class Product {

    private long productId;
    private String name;
    private LocalDate dateSupplied;
    private int quantityInStock;
    private double unitPrice;

    List<Product> products;

    public Product() {
    }

    public Product(long productId) {
        this.productId = productId;
    }

    public Product(long productId, String name, LocalDate dateSupplied, int quantityInStock, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    public long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateSupplied() {
        return dateSupplied;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateSupplied(LocalDate dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
