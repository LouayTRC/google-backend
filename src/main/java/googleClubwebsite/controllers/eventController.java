package googleClubwebsite.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import googleClubwebsite.models.events;
import googleClubwebsite.services.eventService;

@RequestMapping("events")
@CrossOrigin("*")
@RestController
public class eventController {
	@Autowired
	public eventService eventService;
	
	@PostMapping()
	public events addEvent(@RequestBody events form) {
		return eventService.addEvent(form);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEventbyId(@PathVariable long id) {
		eventService.deleteEventbyId(id);
	}
	
	@GetMapping()
	public List<events> getEventsByActive(@RequestParam boolean active){
		return eventService.getEventByActive(active);
	}
	
	@GetMapping("/{id}")
	public events getEventById(@PathVariable long id) {
		return eventService.getEventById(id);
	}
}
