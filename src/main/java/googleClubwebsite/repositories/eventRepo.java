package googleClubwebsite.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import googleClubwebsite.models.events;

@Repository
public interface eventRepo extends JpaRepository<events,Long>{

	List<events> findByActive(boolean active);


}
