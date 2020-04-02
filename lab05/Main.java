package com.lab05;

public class Main {

    public static void main(String[] args) {
        User u1 = new User("Danil", "Bilyy", "s355561@gmail.com","danila_-007");
        User u2 = new User("s532121@gmail.com");
        u2.createUserFromGuest("Vitalik", "komandos", "vitalik_007");


        Product p1 = new Product("potato",22,"wad1",);
        Product p2 = new Product("rice", 2.88, "fds2",9);
        Product p3 = new Product("grechka",3.77,"grw3",9);
        p2.setPrice(100);
        p3.setAmount(5);

        Category c1 = new Category();
        Category c2 = new Category("Russian");
        ArrayList<Product> ps1 = new ArrayList<Product>();
        ps1.add(p1);
        ps1.add(p2);
        Category c3 = new Category("Food",ps1);
        c1.addProduct(p1);
        c2.addProduct(p1);
        c3.addProduct(p3);

        Busket b1 = new Busket();
        Busket b2 = new Busket(u1);
        Product[] pss1 = new Product[]{p2};
        Busket b3 = new Busket(u2, pss1);
        b3.addProduct(p2);
        b3.addProduct(p2);
        b3.deleteProduct(p2);
        System.out.println(b3.buy());
    }
}