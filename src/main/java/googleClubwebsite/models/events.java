package googleClubwebsite.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EVENTS")
public class events {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private String nameEvent;
	private String dateEvent;
	private String description;
	private String place;
	private boolean active;
	
	
	 public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "events [id=" + id + ", nameEvent=" + nameEvent + ", dateEvent=" + dateEvent + ", description="
				+ description + ", place=" + place + ", active=" + active + "]";
	}
	public events(String nameEvent, String dateEvent, String description, String place, String active) {
		super();
		this.nameEvent = nameEvent;
		this.dateEvent = dateEvent;
		this.description = description;
		this.place = place;
		this.active = active;
	}
	public events() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameEvent() {
		return nameEvent;
	}
	public void setNameEvent(String nameEvent) {
		this.nameEvent = nameEvent;
	}
	public String getDateEvent() {
		return dateEvent;
	}
	public void setDateEvent(String dateEvent) {
		this.dateEvent = dateEvent;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
}
