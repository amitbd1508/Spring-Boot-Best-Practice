package com.springbestpractice.springbestpractice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class SpringbestpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbestpracticeApplication.class, args);
	}

  @Bean
  public ModelMapper getModelMapper() {
    return new ModelMapper();
  }

}
