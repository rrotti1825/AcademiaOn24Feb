package ap.edu.dao.admission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.admission.Academics;

@Repository
public interface AcademicsRepo extends JpaRepository<Academics, Long>{

}
