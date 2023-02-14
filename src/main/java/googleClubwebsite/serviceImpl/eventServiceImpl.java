package googleClubwebsite.serviceImpl;
import googleClubwebsite.repositories.eventRepo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import googleClubwebsite.models.events;
import googleClubwebsite.services.eventService;

@Service
public class eventServiceImpl implements eventService {

	@Autowired
	private eventRepo eventRepo;
	@Override
	public List<events> getActiveEvents() {
		// TODO Auto-generated method stub
		return eventRepo.findActive();
	}

	@Override
	public List<events> getExpiredEvents() {
		// TODO Auto-generated method stub
		return eventRepo.findExpired();
	}
	
}
