package ap.edu.dao.org;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.org.Campus;

@Repository
public interface CampusRepo extends JpaRepository<Campus, String>{

}
