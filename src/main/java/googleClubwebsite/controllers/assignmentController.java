package googleClubwebsite.controllers;
import googleClubwebsite.models.assignments;
import googleClubwebsite.services.assignmentService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RequestMapping("assignments")
@CrossOrigin("*")
@RestController
public class assignmentController {
	@Autowired
	public assignmentService assignmentService;
	
	@GetMapping("/{id}")
	public assignments getAssignmentById(@PathVariable long id) {
		return assignmentService.getAssignmentById(id);
	}
	
	@PostMapping
	public assignments addAssignment(@RequestBody assignments form) {
		return assignmentService.addAssignment(form);
	}
	
	 @DeleteMapping("/{id}")
	 public void deleteAssignmentById(@PathVariable long id) {
		 assignmentService.deleteAssignmentById(id);
	 }
}
