package googleClubwebsite.services;

import java.util.List;

import org.springframework.stereotype.Service;

import googleClubwebsite.models.assignments;

@Service
public interface assignmentService {
	public assignments getAssignmentById(long id);
	public List<assignments> getActiveAssignments();
}
