package googleClubwebsite.services;

import java.util.List;

import org.springframework.stereotype.Service;

import googleClubwebsite.models.events;

@Service
public interface eventService {
	public events addEvent(events form);
	public void deleteEventbyId(long id);
	public List<events> getEventByActive(boolean active);
	public events getEventById(long id);
}
