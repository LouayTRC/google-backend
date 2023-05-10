package googleClubwebsite.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import googleClubwebsite.models.events;
import googleClubwebsite.repositories.eventRepo;
import googleClubwebsite.services.eventService;

@Service
public class eventServiceImpl implements eventService{

	@Autowired
	private eventRepo eventRepo;
	
	@Override
	public events addEvent(events form) {
		// TODO Auto-generated method stub
		return eventRepo.save(form);
	}

	@Override
	public void deleteEventbyId(long id) {
		// TODO Auto-generated method stub
		eventRepo.deleteById(id);
	}

	@Override
	public List<events> getEventByActive(boolean active) {
		// TODO Auto-generated method stub
		return eventRepo.findByActive(active);
	}

	@Override
	public events getEventById(long id) {
		// TODO Auto-generated method stub
		Optional <events> e=eventRepo.findById(id);
		return e.isPresent() ? e.get() : null;
	}
	
	
}
