package com.jbk.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import com.jbk.domain.Country;
import com.jbk.domain.Employee;

@Configuration
public class HibernateConfig {
	@Autowired
	DataSource dataSource;//ApplicationContext context;
	/*@Bean
	public LocalSessionFactoryBean getSessionFactory(){
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
		sf.setDataSource(dataSource);
		
		//sf.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
		sf.setAnnotatedClasses(Employee.class);
		sf.setAnnotatedClasses(Country.class);
		
		return sf;
		
	}*/
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	      LocalContainerEntityManagerFactoryBean em = new          LocalContainerEntityManagerFactoryBean();
	      em.setDataSource(dataSource);
	      em.setPackagesToScan(new String[] { "com.jbk" });
	      JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	      em.setJpaVendorAdapter(vendorAdapter);
	      return em;
	   }
}
