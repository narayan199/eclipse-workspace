package swingJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component("push")
public class Push {
	private JdbcTemplate jdbcTemplate;

	public Push() {
	}

	public Push(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(User user) {
		  //sql
        String query="insert into User(fname,lname,username,password,email,phone) values(?,?,?,?,?,?)";
        //fire query
        int result = jdbcTemplate.update(query,user.getFirstname(),user.getLastname(),user.getUsername(),user.getPassword(),user.getEmail(),user.getPhone());
        System.out.println(result);
		return result;
	}
}
