package com.github.weiwei02.springcloud.task.batch.peoplebatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableBatchProcessing
@EnableAspectJAutoProxy
public class PeopleBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeopleBatchApplication.class, args);
	}
}
