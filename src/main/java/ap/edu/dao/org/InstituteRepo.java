package ap.edu.dao.org;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.org.Institution;

@Repository
public interface InstituteRepo extends JpaRepository<Institution, String>{

}
