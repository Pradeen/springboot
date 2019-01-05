package com.learn.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

public class ApplicationConfig {
	
	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
		final TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
		return tomcat;
	}
}
