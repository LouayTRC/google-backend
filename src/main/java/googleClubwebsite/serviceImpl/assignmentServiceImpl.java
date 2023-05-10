package googleClubwebsite.serviceImpl;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import googleClubwebsite.models.assignments;
import googleClubwebsite.repositories.assignmentRepo;
import googleClubwebsite.services.assignmentService;

@Service
public class assignmentServiceImpl implements assignmentService {
	

	@Autowired
	private assignmentRepo assignmentRepo;

	@Override
	public assignments addAssignment(assignments form) {
		// TODO Auto-generated method stub
		return assignmentRepo.save(form);
	}
	
	@Override
	public assignments getAssignmentById(long id) {
		// TODO Auto-generated method stub
		Optional <assignments> a=assignmentRepo.findById(id);
		return a.isPresent() ? a.get() : null;
	}
	@Override
	public void deleteAssignmentById(long id) {
		// TODO Auto-generated method stub
		assignmentRepo.deleteById(id);
	}

	
	

	
}
