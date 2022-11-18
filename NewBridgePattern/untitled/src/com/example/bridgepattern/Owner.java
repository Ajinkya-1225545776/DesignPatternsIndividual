package com.example.bridgepattern;

public abstract class Owner {
    protected ProduceMenu owner1;
    protected ProduceMenu owner2;

    protected Owner(ProduceMenu o1, ProduceMenu o2) {
        this.owner1 = o1;
        this.owner2 = o2;
    }

    public abstract void manu();
}