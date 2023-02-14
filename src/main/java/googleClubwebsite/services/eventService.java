package googleClubwebsite.services;

import java.util.List;

import org.springframework.stereotype.Service;
import googleClubwebsite.models.events;
@Service
public interface eventService {
	public List<events> getActiveEvents();
	public List<events> getExpiredEvents();
}
