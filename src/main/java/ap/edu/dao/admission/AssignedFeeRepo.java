package ap.edu.dao.admission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.admission.AssignedFee;


@Repository
public interface AssignedFeeRepo extends JpaRepository<AssignedFee, Long> {

}
