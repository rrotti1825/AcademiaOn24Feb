package ap.edu.dao.schedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.schedule.TotalMarksTracker;

@Repository
public interface TotalMarksTrackerRepo extends JpaRepository<TotalMarksTracker, Long>{

}
