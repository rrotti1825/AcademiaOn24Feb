package ap.edu.dao.schedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.schedule.TestSchedule;

@Repository
public interface TestScheduleRepo extends JpaRepository<TestSchedule, Long>{

}
