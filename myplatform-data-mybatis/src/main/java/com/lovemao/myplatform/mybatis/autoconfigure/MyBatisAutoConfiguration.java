package com.lovemao.myplatform.mybatis.autoconfigure;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * @Description <br>
 * @Author MaoC <br>
 * @Since 2018年2月26日上午10:06:53 <br>
 *
 */
@Configuration
@ConditionalOnClass({ SqlSessionFactoryBean.class })
@AutoConfigureAfter(DataSourceAutoConfiguration.class)
@MapperScan(basePackages = { "**/mapper", "**/mappers", "**/dao" })
@EnableTransactionManagement
public class MyBatisAutoConfiguration {

	@Autowired
	private DataSource dataSource;

	@Bean(name = "sqlSessionFactory")
	@ConditionalOnMissingBean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		return sessionFactory.getObject();
	}

}
