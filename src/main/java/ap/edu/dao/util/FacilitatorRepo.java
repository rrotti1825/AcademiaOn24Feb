package ap.edu.dao.util;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.util.Facilitator;

@Repository
public interface FacilitatorRepo extends JpaRepository<Facilitator, Long>{

}
