package com.example.FactoryMethod.content;

public class LongArticleContent implements Content {
    @Override
    public void produce() {
        System.out.println("Producing long article content");
    }
}