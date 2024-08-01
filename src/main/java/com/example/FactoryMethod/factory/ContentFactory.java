package com.example.FactoryMethod.factory;


import com.example.FactoryMethod.content.Content;

public abstract class ContentFactory {
    public abstract Content createContent(String type);

    public void produceContent(String type) {
        Content content = createContent(type);
        content.produce();
    }
}
