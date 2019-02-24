package ap.edu.dao.schedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.schedule.AttendanceSchedule;

@Repository
public interface AttendanceScheduleRepo extends JpaRepository<AttendanceSchedule, Long>{

}
