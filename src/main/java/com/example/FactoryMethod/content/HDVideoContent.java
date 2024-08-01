package com.example.FactoryMethod.content;

public class HDVideoContent implements Content {
    @Override
    public void produce() {
        System.out.println("Producing HD video content");
    }
}
