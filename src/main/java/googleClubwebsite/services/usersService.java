package googleClubwebsite.services;

import java.util.List;

import org.springframework.stereotype.Service;

import googleClubwebsite.models.users;

@Service
public interface usersService {
	public users getUserById(long id);
	public List<users> getAllUsers();
	public users getUserByUsername(String username);
	public users updateUser(users form);
	public users addUser(users form);
}
