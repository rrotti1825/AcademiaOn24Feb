package ap.edu.dao.admission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.admission.Admission;
@Repository
public interface AdmissionRepo extends JpaRepository<Admission, Long>{

}
