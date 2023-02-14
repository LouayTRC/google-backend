package googleClubwebsite.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import googleClubwebsite.models.users;


@Repository
public interface usersRepo extends JpaRepository<users,Long>{

	Optional<users> findByUsername(String username);

}
