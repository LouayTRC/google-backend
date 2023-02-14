package googleClubwebsite.controllers;
import googleClubwebsite.models.assignments;
import googleClubwebsite.services.assignmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("ASSIGNMENTS")
@CrossOrigin("*")
@RestController
public class assignmentController {
	@Autowired
	public assignmentService assignmentService;
	
	@GetMapping("/{id}")
	public assignments getAssignmentById(long id) {
		return assignmentService.getAssignmentById(id);
	}
	
	@GetMapping
	public List<assignments> getActiveAssignments(){
		return assignmentService.getActiveAssignments();
	}

}
