package com.ecom.app.services.config;

import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@RefreshScope
public class HibernateConfiguration {

	@Resource
	private Environment environment;

	@Value("${datasource.url}")
	private String datasourceUrl;

	@Value("${datasource.username}")
	private String datasourceUsername;

	@Value("${datasource.password}")
	private String datasourcePassword;

	@Value("${hibernate.ddl-auto}")
	private String hibernate_ddl_auto;

	@Value("${spring.datasource.driverClassName}")
	private String driverClassName;

	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl(datasourceUrl);
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUsername(datasourceUsername);
		dataSource.setPassword(datasourcePassword);
		return dataSource;
	}

	@Bean(name = "sessionFactory")
	public LocalSessionFactoryBean buildSessionFactory() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(dataSource());
		localSessionFactoryBean.setPackagesToScan(new String[] { "com.ecom.app.domain" });
		localSessionFactoryBean.setHibernateProperties(hibernateProperties());
		return localSessionFactoryBean;
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", environment.getRequiredProperty("spring.jpa.database-platform"));
		properties.put("hibernate.show_sql", environment.getRequiredProperty("spring.jpa.show-sql"));
		properties.put("hibernate.format_sql", environment.getRequiredProperty("spring.jpa.hibernate.format_sql"));
		properties.put("hibernate.use_sql_comments",
				environment.getRequiredProperty("spring.jpa.hibernate.use_sql_comments"));
		properties.put("hibernate.hbm2ddl.auto", hibernate_ddl_auto);
		// properties.put("hibernate.cache.region.factory_class",
		// environment.getRequiredProperty("spring.jpa.properties.hibernate.cache.region.factory_class"));
		properties.put("hibernate.generate_statistics",
				environment.getRequiredProperty("spring.jpa.hibernate.generate_statistics"));

		return properties;
	}

	@Bean(name = "transactionManager")
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
		transactionManager.setDataSource(dataSource());
		return transactionManager;
	}

}
