package com.example.FactoryMethod.content;

public class SDVideoContent implements Content {
    @Override
    public void produce() {
        System.out.println("Producing SD video content");
    }
}
