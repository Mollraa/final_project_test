package com.prj.cosm.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.context.SecurityContextPersistenceFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	DataSource dataSource;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public CustomLoginSuccessHandler successHandler() {
		return new CustomLoginSuccessHandler();
	}

	@Bean
	public AccessDeniedHandler accessDeniedHandler() {
		return new WebAccessDenyHandler();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((requests) -> requests
				.antMatchers("/", "/top", "/login", "/joinForm", "/empCheckId", "/userInsert", "/userSelect",
						"/userCheckId", "/clientInsert", "/getAlertList", "/getAlert", "/insertAlert", "/updateAlert",
						"/userInfo", "/userConfirm")
				.permitAll().antMatchers("/produce/**").hasAnyAuthority("ROLE_D0101", "ROLE_D0105")
				.antMatchers("/client/**").hasAnyAuthority("ROLE_D0109","ROLE_D0101","ROLE_D0103", "ROLE_D0104","ROLE_D0102")
				.antMatchers("/material/**").hasAnyAuthority("ROLE_D0103", "ROLE_D0104")
				.antMatchers( "/orders/**").hasAnyAuthority("ROLE_D0109", "ROLE_D0101","ROLE_D0110")
				.antMatchers("/equipment/**")
				.hasAnyAuthority("ROLE_D0108", "ROLE_D0107", "ROLE_D0101", "ROLE_D0106", "ROLE_D0111", "ROLE_D0105")
				.antMatchers("/**").hasAuthority("ROLE_D0101").anyRequest().authenticated()).formLogin()
				.loginPage("/login").failureUrl("/login?error=error").usernameParameter("userId").loginProcessingUrl("/login")
				.successHandler(successHandler()).and().logout().logoutUrl("/logout").logoutSuccessUrl("/login")
				.invalidateHttpSession(true).deleteCookies("JSESSIONID").and().exceptionHandling()
				.accessDeniedHandler(accessDeniedHandler()).and()
		// .csrf().disable()
		// .userDetailsService(userService());
		;

		return http.build();
	}

	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web.ignoring().antMatchers("/images/**", "/js/**", "/css/**", "/equipmentCss/**", "/assets/**");
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		String loginSql = "select USERS_ID, USERS_PASSWORD, 1 from USERS where USERS_ID = ?";

		String authSql = "select users_id, 'ROLE_'||users_author FROM users where users_id = ?";

		auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(loginSql)
				.authoritiesByUsernameQuery(authSql)
		// .passwordEncoder(passwordEncoder())
		;
	}

}