package com.lab05;

import java.util.Arrays;

public class Busket {
    private User user;
    public Product[] products;
    private Product empty = new Product("None",0,0);

    public Busket() {
    }

    public Busket(User user) {
        this.user = user;
    }

    public Busket(User user, Product[] products) {
        this.user = user;
        for (Product value : products) {
            if (value.numOfItems > 0) {
                this.products = products;
            } else {
                System.out.println("Out of stock!");
            }
        }
    }

    public void addProduct(Product product) {
        if (product.numOfItems > 0) {
            products = Arrays.copyOf(products, products.length+1);
            products[products.length-1] = product;
            product.numOfItems = product.numOfItems -1;
        } else {
            System.out.println("Out of stock!");
        }
    }

    public void deleteProduct(Product product) {
        Product[] newArray = new Product[products.length - 1];
        for (int i = 0; i < products.length; i++) {
            if (products[i] == product) {
                for (int j = 0; j < i; j++) {
                    newArray[j] = products[j];
                }
                for (int k = i; k < products.length - 1; k++) {
                    newArray[k] = products[k + 1];
                }
                break;
            }
        }
        products = Arrays.copyOf(products, products.length-1);
        for (int l=0; l<products.length; l++){
            products[l] = newArray[l];
        }
        product.numOfItems = product.numOfItems +1;

    }

    public double buy(){
        double[] allPrices = new double[products.length];
        for (int i = 0; i < products.length; i++) {
            allPrices[i] = products[i].getPrice();
        }
        double bill = 0;
        for (double a : allPrices) {
            bill += a;
        }
        return bill;
    }

}