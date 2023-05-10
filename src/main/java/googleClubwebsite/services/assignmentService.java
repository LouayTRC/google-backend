package googleClubwebsite.services;





import org.springframework.stereotype.Service;

import googleClubwebsite.models.assignments;

@Service
public interface assignmentService {
	public assignments getAssignmentById(long id);
	public assignments addAssignment(assignments form);

	public void deleteAssignmentById(long id);
}
