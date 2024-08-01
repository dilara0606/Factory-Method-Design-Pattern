package com.example.FactoryMethod.factory;


import com.example.FactoryMethod.content.Content;
import com.example.FactoryMethod.content.HDVideoContent;
import com.example.FactoryMethod.content.SDVideoContent;

public class VideoContentFactory extends ContentFactory {
    @Override
    public Content createContent(String type) {
        switch (type) {
            case "HD":
                return new HDVideoContent();
            case "SD":
                return new SDVideoContent();
            default:
                throw new IllegalArgumentException("Unknown video type");
        }
    }
}
