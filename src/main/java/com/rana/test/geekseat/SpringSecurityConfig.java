package com.rana.test.geekseat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringSecurityConfig{
	 @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.any())              
	          .paths(PathSelectors.regex("/api.*"))                          
	          .build();                                           
	    }
	 
//	 protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//		auth.inMemoryAuthentication().withUser("user").password("hungry12345678").roles("USER").and().withUser("admin")
//				.password("hungry12345678").roles("USER", "ADMIN");
//
//	}
//
//	// Secure the endpoins with HTTP Basic authentication
//	protected void configure(HttpSecurity http) throws Exception {
//
//		http
//				// HTTP Basic authentication
//				.httpBasic().and().authorizeRequests().antMatchers(HttpMethod.POST, "/purchase").hasRole("USER")
//				.antMatchers(HttpMethod.POST, "/api/customer/add").hasRole("ADMIN").and().csrf().disable().formLogin()
//				.disable();
//	}

}
