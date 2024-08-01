package com.example.FactoryMethod.content;

public class TrueFalseQuizContent implements Content {
    @Override
    public void produce() {
        System.out.println("Producing true/false quiz content");
    }
}