package com.mihail.security.configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();

        auth.inMemoryAuthentication().withUser(userBuilder.username("miha").password("miha").roles("EMPLOYEE"));
        auth.inMemoryAuthentication().withUser(userBuilder.username("lera").password("lera").roles("HR"));
        auth.inMemoryAuthentication().withUser(userBuilder.username("vlada").password("vlada").roles("HR"));
    }
}
