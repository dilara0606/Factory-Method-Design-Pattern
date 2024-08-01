package com.example.FactoryMethod;

import com.example.FactoryMethod.factory.ArticleContentFactory;
import com.example.FactoryMethod.factory.ContentFactory;
import com.example.FactoryMethod.factory.QuizContentFactory;
import com.example.FactoryMethod.factory.VideoContentFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryMethodApplication.class, args);

		ContentFactory videoFactory = new VideoContentFactory();
		videoFactory.produceContent("HD"); // Output: Producing HD video content
		videoFactory.produceContent("SD"); // Output: Producing SD video content

		ContentFactory articleFactory = new ArticleContentFactory();
		articleFactory.produceContent("short"); // Output: Producing short article content
		articleFactory.produceContent("long"); // Output: Producing long article content

		ContentFactory quizFactory = new QuizContentFactory();
		quizFactory.produceContent("multiple_choice"); // Output: Producing multiple choice quiz content
		quizFactory.produceContent("true_false"); // Output: Producing true/false quiz content
	}

}
