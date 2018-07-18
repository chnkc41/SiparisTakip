package com.cihan.siparis;

import java.util.Properties;

import javax.annotation.PostConstruct;

import org.knowm.yank.Yank;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
public class YankInitBean {
	
	@Value("${db.url}")
	String jdbcUrl;
	
	@Value("${db.username}")
	String username;
	
	@Value("${db.password}")
	String password;
	
	@PostConstruct
	public void init() {
		Properties dbProps = new Properties();
		dbProps.setProperty("jdbcUrl", jdbcUrl);
		dbProps.setProperty("username", username);
		dbProps.setProperty("password", password);

		 // setup connection pool
		Yank.setupDefaultConnectionPool(dbProps);
		Yank.setThrowWrappedExceptions(true);   // hataları görmek için 
	}
}
