package com.cg.bts.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	  @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.inMemoryAuthentication()
	            .withUser("smith")
	            .password("{noop}password")
	            .roles("ADMIN")
	            .and()
	            .withUser("john")
	            .password("{noop}password")
	            .roles("EMPLOYEE");
	    }

	 

	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	         .csrf().disable()
	         /*.logout().clearAuthentication(true)
	         .logoutSuccessUrl("/")
	         .deleteCookies("JSESSIONID")
	         .invalidateHttpSession(true)
	         .and()*/
	         .authorizeRequests()
	         .antMatchers("/").permitAll()
	         .antMatchers("/user/add").hasAnyRole("ADMIN","EMPLOYEE")
	         .antMatchers("/user/update/*").hasRole("ADMIN")
	         .anyRequest().authenticated()
	         .and()
	         .httpBasic();
	    }
}

