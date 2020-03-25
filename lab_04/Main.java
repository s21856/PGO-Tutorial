package com.company;

public class Main {

    public static void main(String[] args) {
        //task1
        User u1 = new User("Danil", "Bilyy", "s355561@gmail.com","danila_-007");
        User u2 = new User("s532121@gmail.com");
        u2.createUserFromGuest("Vitalik", "komandos", "vitalik_007");

        //task2
        Product p1 = new Product("potato",22,"wad1",);
        Product p2 = new Product("rice", 2.88, "fds2",9);
        Product p3 = new Product("grechka",3.77,"grw3",9);
        p2.setPrice(100);
        p3.setAmount(5);
    }
}
