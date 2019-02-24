package ap.edu.dao.admission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.admission.Tracker;

@Repository
public interface TrackerRepo extends JpaRepository<Tracker, Long> {

}
