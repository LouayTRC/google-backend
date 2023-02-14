package googleClubwebsite.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="USERS")
public class users {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String username;
	private String mail;
	private String password;
	private String role;
	private boolean statue;
	private int score;
	
	
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "users [id=" + id + ", name=" + name + ", username=" + username + ", mail=" + mail + ", password="
				+ password + ", role=" + role + ", statue=" + statue + ", score=" + score + "]";
	}
	public users(String name, String username, String mail, String password, String role, boolean statue, int score) {
		super();
		this.name = name;
		this.username = username;
		this.mail = mail;
		this.password = password;
		this.role = role;
		this.statue = statue;
		this.score = score;
	}
	public users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isStatue() {
		return statue;
	}
	public void setStatue(boolean statue) {
		this.statue = statue;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
