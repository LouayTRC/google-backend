package googleClubwebsite.serviceImpl;
import googleClubwebsite.repositories.usersRepo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import googleClubwebsite.models.users;
import googleClubwebsite.services.usersService;

@Service
public class userServiceImpl implements usersService {
	
	@Override
	public users addUser(users form) {
		// TODO Auto-generated method stub
		return usersRepo.save(form);
	}

	@Autowired
	private usersRepo usersRepo;
	
	@Override
	public users getUserById(long id) {
		// TODO Auto-generated method stub
		Optional <users> user=usersRepo.findById(id);
		return user.isPresent() ? user.get() : null;
	}

	@Override
	public List<users> getAllUsers() {
		// TODO Auto-generated method stub
		return usersRepo.findAll();
	}

	@Override
	public users getUserByUsername(String username) {
		// TODO Auto-generated method stub
		Optional <users> user=usersRepo.findByUsername(username);
		return user.isPresent() ? user.get() : null;
	}

	@Override
	public users updateUser(users form) {
		// TODO Auto-generated method stub
		return usersRepo.save(form);
	}
	
}
