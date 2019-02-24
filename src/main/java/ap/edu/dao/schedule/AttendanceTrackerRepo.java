package ap.edu.dao.schedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.schedule.AttendanceTracker;

@Repository
public interface AttendanceTrackerRepo extends JpaRepository<AttendanceTracker, Long>{

}
