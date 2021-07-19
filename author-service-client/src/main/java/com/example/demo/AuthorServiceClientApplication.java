package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@EnableDiscoveryClient
@SpringBootApplication
public class AuthorServiceClientApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(AuthorServiceClientApplication.class, args);
		
		
		   
	}   
		    
		    @Bean
		  
		    public WebClient.Builder builder(){
		        
		        
		        return WebClient.builder();
		    }

		 

		    @Bean
		    public WebClient client(WebClient.Builder builder) {
		        
		        return builder.build();
		        
		    }
	

}
