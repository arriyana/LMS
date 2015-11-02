package ukma.baratheons.lms.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan({"ukma.baratheons.lms.controller",
				"ukma.baratheons.lms.dao",
				"ukma.baratheons.lms.service"})
@PropertySource("classpath:properties/jdbc.properties")
public class WebConfig {

	@Autowired
	private Environment env;

	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName(env.getRequiredProperty("jdbc.driverClassName"));
		driverManagerDataSource.setUrl(env.getRequiredProperty("jdbc.url"));
		driverManagerDataSource.setUsername(env.getRequiredProperty("jdbc.username"));
		driverManagerDataSource.setPassword(env.getRequiredProperty("jdbc.password"));
		return driverManagerDataSource;
	}

	@Bean
	@Autowired
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

}