package io.springconfig.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Initializer extends SpringBootServletInitializer{
    public static void main( String[] args )
    {
        SpringApplication.run(Initializer.class,args);
    }
}
