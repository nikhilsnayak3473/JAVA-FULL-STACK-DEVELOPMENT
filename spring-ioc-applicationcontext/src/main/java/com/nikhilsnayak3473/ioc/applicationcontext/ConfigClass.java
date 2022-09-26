package com.nikhilsnayak3473.ioc.applicationcontext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.nikhilsnayak3473.ioc.applicationcontext")
@PropertySource("classpath:app.properties")
public class ConfigClass {

}
