package com.snowriver.prototype.simple;

public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype customer) {
        return (Prototype)customer.clone();
    }
}