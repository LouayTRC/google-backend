package googleClubwebsite.repositories;







import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import googleClubwebsite.models.assignments;


@Repository
public interface assignmentRepo extends JpaRepository<assignments,Long>{






}
