package com.example.FactoryMethod.factory;

import com.example.FactoryMethod.content.Content;
import com.example.FactoryMethod.content.LongArticleContent;
import com.example.FactoryMethod.content.ShortArticleContent;

public class ArticleContentFactory extends ContentFactory {
    @Override
    public Content createContent(String type) {
        switch (type) {
            case "short":
                return new ShortArticleContent();
            case "long":
                return new LongArticleContent();
            default:
                throw new IllegalArgumentException("Unknown article type");
        }
    }
}
