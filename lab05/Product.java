package com.lab05;

public class Product {

    private String name;
    public double price;
    private int productCode;
    public int numOfItems;

    public Product(String name, double price, int productCode){
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        numOfItems = 0;
    }

    public Product(String name, double price, int productCode, int numOfItems){
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        if (numOfItems<0){
            System.out.println("No less than 0");
        } else{
            this.numOfItems = numOfItems;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumOfItems(int numOfItems) {
        if(numOfItems<0){
            System.out.println("No less than 0");
        } else{
            this.numOfItems = numOfItems;
        }
    }

    public double getPrice(){
        return price;
    }
}
