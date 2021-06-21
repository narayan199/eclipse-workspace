package swingJdbc;

public class User {
	String firstname;
	String username;
	public User() {
	}
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", username=" + username + ", lastname=" + lastname + ", Email=" + Email
				+ ", password=" + password + ", phone=" + phone + "]";
	}
	public User(String firstname, String username, String lastname, String email, String password, String phone) {
		super();
		this.firstname = firstname;
		this.username = username;
		this.lastname = lastname;
		Email = email;
		this.password = password;
		this.phone = phone;
	}
	String lastname;
	String Email;
	String password;
	String phone;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String string) {
		this.phone = string;
	}
}
