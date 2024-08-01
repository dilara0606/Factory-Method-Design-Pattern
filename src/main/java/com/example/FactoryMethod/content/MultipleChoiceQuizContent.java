package com.example.FactoryMethod.content;

public class MultipleChoiceQuizContent implements Content {
    @Override
    public void produce() {
        System.out.println("Producing multiple choice quiz content");
    }
}
