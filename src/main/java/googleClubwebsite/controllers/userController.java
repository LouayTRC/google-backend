package googleClubwebsite.controllers;
import googleClubwebsite.models.users;
import googleClubwebsite.services.usersService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("USERS")
@CrossOrigin("*")
@RestController
public class userController {
	@Autowired
	public usersService usersService;
	
	@GetMapping("/{id}")
	public users getUserById(@PathVariable long id) {
		return usersService.getUserById(id);
	}

	@GetMapping
	public List<users> getAllUsers(){
		return usersService.getAllUsers();
	}
	
	@GetMapping
	public users getUserByUsername(@RequestParam String username) {
		return usersService.getUserByUsername(username);
	}
	
	@PutMapping()
	public users updateUser(@RequestBody users form) {
		return usersService.updateUser(form);
	}
	
	@PostMapping
	public users addUser(users form) {
		return usersService.addUser(form);
	}


}
