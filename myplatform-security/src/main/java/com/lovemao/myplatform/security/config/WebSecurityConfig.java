package com.lovemao.myplatform.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.lovemao.myplatform.security.service.CustomUserService;

/**
 * 
 * @Description <br>
 * @Author MaoC <br>
 * @Since 2018年2月26日上午10:48:26 <br>
 *
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	UserDetailsService customUserService() {
		return new CustomUserService();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customUserService()); // 3
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated() // 4
				.and().formLogin().loginPage("/login").failureUrl("/login?error").permitAll() // 5
				.and().logout().permitAll(); // 6

	}

}
