package com.example.bridgepattern;

public class HelloController {
    public HelloController() {
    }

    public static void main(String[] args) {
        Owner Seller = new Seller(new MeatProductMenu(), new ProduceProductMenu());
        Seller.manu();
        System.out.println();
    }
}
