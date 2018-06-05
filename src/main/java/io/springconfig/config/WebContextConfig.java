package io.springconfig.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan(basePackages = "io.springconfig")
@EntityScan("io.springconfig.domain")
@EnableJpaRepositories("io.springconfig.repository")
@PropertySource("classpath:application.properties")
public class WebContextConfig extends WebMvcConfigurerAdapter{

}
