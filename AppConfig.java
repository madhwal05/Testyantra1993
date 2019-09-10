package com.app.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.app")
@PropertySource("classpath:App.properties")
@Import({SecurityConfig.class})
public class AppConfig {

	@Autowired
	private Environment env;
	
	@Bean
	public InternalResourceViewResolver view()
	{
		InternalResourceViewResolver iv=new InternalResourceViewResolver();
		iv.setPrefix(env.getProperty("prefix"));
		iv.setSuffix(env.getProperty("suffix"));
		return iv;
	}
	
	@Bean
	public BasicDataSource ds()
	{
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName(env.getProperty("dc"));
		ds.setUrl(env.getProperty("url"));
		ds.setUsername(env.getProperty("un"));
		ds.setPassword(env.getProperty("pwd"));
		return ds;
	}
	
	@Bean
	public BCryptPasswordEncoder enc()
	{
		BCryptPasswordEncoder en=new BCryptPasswordEncoder();
		return en;
	}
}
