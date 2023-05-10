package googleClubwebsite.repositories;






import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import googleClubwebsite.models.users;


@Repository
public interface usersRepo extends JpaRepository<users,Long>{



	


}
