package com.lab05;

import java.util.ArrayList;

public class Category {
    public String name;
    public ArrayList<Product> products = new ArrayList<Product>();
    private Product empty = new Product("None",0,0);

    public Category(){
        products.add(empty);
    }

    public Category(String name){
        this.name = name;
        products.add(empty);
    }

    public Category(String name, ArrayList<Product> products){
        this.name = name;
        this.products = products;
    }

    public void addProduct(Product product){
        if (products.get(0)==empty) {
            products.remove(0);
        }
        products.add(product);
    }

    public void deleteProduct(Product product){
        products.remove(product);
    }

    public void setName(String name) {
        this.name = name;
    }
}