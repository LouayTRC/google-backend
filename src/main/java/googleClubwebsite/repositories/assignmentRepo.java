package googleClubwebsite.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import googleClubwebsite.models.assignments;


@Repository
public interface assignmentRepo extends JpaRepository<assignments,Long>{

	List<assignments> findActive();

}
