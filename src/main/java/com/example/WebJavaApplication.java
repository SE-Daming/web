package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class WebJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebJavaApplication.class, args);
	}
	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration config = new CorsConfiguration();
		//允许白名单域名进行跨域调用
		config.addAllowedOriginPattern("*");
		//允许跨越发送cookie
		config.setAllowCredentials(true);
		//放行全部原始头信息
		config.addAllowedHeader("*");
		//允许所有请求方法跨域调用
		config.addAllowedMethod("*");
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
	}

}
