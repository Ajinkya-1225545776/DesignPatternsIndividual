package com.example.bridgepattern;

public class Seller extends Owner {
    public Seller(ProduceMenu o1, ProduceMenu o2) {
        super(o1, o2);
    }

    public void manu() {
        System.out.print("Seller is showed ");
        this.owner1.work();
        this.owner2.work();
    }
}
