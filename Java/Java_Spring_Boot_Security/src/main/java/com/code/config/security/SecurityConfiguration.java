package com.code.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
 
	@Autowired
	private AutenticacaoService autenticacaoService;
	
	// Configura autenticação
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(autenticacaoService).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	// Configura de autorização
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
		.antMatchers(HttpMethod.GET, "/topico").permitAll()
		.antMatchers(HttpMethod.GET, "/topico/*").permitAll()
		.anyRequest().authenticated()
		.and().formLogin();
	}
	
	// Configura recursos estáticos -  Css, JS, Imagens...
	@Override
	public void configure(WebSecurity web) throws Exception {

	}
}
