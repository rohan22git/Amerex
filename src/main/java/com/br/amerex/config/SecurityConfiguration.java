package com.br.amerex.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.br.amerex.tfinterface.entities.LoginPage;

@Configuration
public class SecurityConfiguration {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity)throws Exception {
		httpSecurity.csrf().disable()
		.authorizeHttpRequests()
		.antMatchers("/login")
		.permitAll()		
		.anyRequest()
		.authenticated()
		.and()		
		.formLogin()		
		.loginPage("/login")		
		.loginProcessingUrl("/dologin")		
		.defaultSuccessUrl("/")	
		//.failureHandler(authenticationFailureHandler())
		.failureForwardUrl("/error");
		
//		.and()
//		.logout()
//        .deleteCookies("JSESSIONID")
//        .and()
//        .rememberMe()
//        .key("uniqueAndSecret");
//			
		return httpSecurity.build();
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationFailureHandler authenticationFailureHandler() {
	    return new CustomAuthenticationFailureHandler();
	} 
	

}
