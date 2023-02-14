package googleClubwebsite.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
	
@Entity
@Table(name="ASSIGNMENTS")
public class assignments {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private String deadline;
	private int score;
	private boolean active;
	public assignments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public assignments(String title, String description, String deadline, int score, boolean active) {
		super();
		this.title = title;
		this.description = description;
		this.deadline = deadline;
		this.score = score;
		this.active = active;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "assignments [id=" + id + ", title=" + title + ", description=" + description + ", deadline=" + deadline
				+ ", score=" + score + ", active=" + active + "]";
	}
	
}
