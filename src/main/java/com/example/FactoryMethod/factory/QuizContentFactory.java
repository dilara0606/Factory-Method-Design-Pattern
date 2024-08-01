package com.example.FactoryMethod.factory;

import com.example.FactoryMethod.content.Content;
import com.example.FactoryMethod.content.MultipleChoiceQuizContent;
import com.example.FactoryMethod.content.TrueFalseQuizContent;

public class QuizContentFactory extends ContentFactory {
    @Override
    public Content createContent(String type) {
        switch (type) {
            case "multiple_choice":
                return new MultipleChoiceQuizContent();
            case "true_false":
                return new TrueFalseQuizContent();
            default:
                throw new IllegalArgumentException("Unknown quiz type");
        }
    }
}
