package com.yyz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.yyz.controller","com.yyz.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
