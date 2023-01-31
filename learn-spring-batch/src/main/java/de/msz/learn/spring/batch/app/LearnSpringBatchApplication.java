package de.msz.learn.spring.batch.app;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan({
	"de.msz.learn.spring.batch.config",
	"de.msz.learn.spring.batch.service",
	"de.msz.learn.spring.batch.listener",
	"de.msz.learn.spring.batch.reader",
	"de.msz.learn.spring.batch.processor",
	"de.msz.learn.spring.batch.writer",
	"de.msz.learn.spring.batch.controller"
})
@EnableAsync
@EnableScheduling
public class LearnSpringBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBatchApplication.class, args);
	}

}
