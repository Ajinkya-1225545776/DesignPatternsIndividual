package com.example.bridgepattern;

public class Buyer extends Owner {
    public Buyer(ProduceMenu o1, ProduceMenu o2) {
        super(o1, o2);
    }

    public void manu() {
        System.out.print("Buyer is showed");
        this.owner1.work();
        this.owner2.work();
    }
}