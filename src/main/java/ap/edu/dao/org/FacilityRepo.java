package ap.edu.dao.org;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.org.Facility;

@Repository
public interface FacilityRepo extends JpaRepository<Facility, String>{

}
