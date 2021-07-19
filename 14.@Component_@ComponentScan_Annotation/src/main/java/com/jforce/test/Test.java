package com.jforce.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jforce.model.HesapMakinesi;

public class Test {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext applicationContext  = new ClassPathXmlApplicationContext("application-context.xml");
		
			HesapMakinesi hesapMakinesi =applicationContext.getBean("hesapMakinesiBean",HesapMakinesi.class);
			hesapMakinesi.sonuclariYazdir(10, 2);
		
		applicationContext.close();
		
	}
}
