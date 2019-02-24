package ap.edu.dao.schedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.schedule.TestMarksTracker;

@Repository
public interface TestMarksTrackerRepo extends JpaRepository<TestMarksTracker, Long>{

}
