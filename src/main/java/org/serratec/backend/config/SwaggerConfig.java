package org.serratec.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("org.serratec.backend.controller"))
				.paths(PathSelectors.any())
				.build().apiInfo(apiInfo());
		
	}
	
	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfoBuilder()
				.title("ECOMMERCE RESTSIX")
				.description("API do Ecommerce RestSix")
				.license("MIT")
				.licenseUrl("https://www.mit.edu/~amini/LICENSE.md")
				.version("2021")
				.contact(new Contact("Serratec", "www.serratec.org.br", "serratec@gmail.com"))
				.build();
		return apiInfo;
	}


}
