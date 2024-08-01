package com.example.FactoryMethod.content;

public class ShortArticleContent implements Content {
    @Override
    public void produce() {
        System.out.println("Producing short article content");
    }
}
