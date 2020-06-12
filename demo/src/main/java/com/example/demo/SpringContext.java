package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.example.db.mapper.TestMapper;
import com.example.service.TestService;

@Configuration
@PropertySource("classpath:default.properties")
public class SpringContext {

    @Value("${title}")
    String title;

    @Bean(name = "mainFrame")
    public MainFrame createMainFrame() {
        return new MainFrame(title);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer setUp() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
    @Bean
    public TestService testService() {
        return new TestService();
    }
    
    
}
