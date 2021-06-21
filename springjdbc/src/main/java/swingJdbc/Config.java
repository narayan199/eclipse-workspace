
	package swingJdbc;
	import javax.sql.DataSource;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.jdbc.datasource.DriverManagerDataSource;
	@Configuration
	public class Config {
		public DataSource getDataSource()
		{
			DriverManagerDataSource ds = new DriverManagerDataSource();
			ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			ds.setUrl("jdbc:mysql://Localhost:3306/jdbc");
			ds.setUsername("root");
			ds.setPassword(null);
			return ds;
		}
		@Bean("jdbcTemplate")
		public JdbcTemplate getTemplete()
		{
		 JdbcTemplate jdbcTemplate = new JdbcTemplate();
		 jdbcTemplate.setDataSource(getDataSource());
			return jdbcTemplate;
		}
		@Bean("push")
		public Push getPush()
		{
			Push push = new Push();
			push.setJdbcTemplate(getTemplete());
			return push;
		}
	}


