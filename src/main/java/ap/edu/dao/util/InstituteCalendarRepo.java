package ap.edu.dao.util;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.util.InstituteCalendar;

@Repository
public interface InstituteCalendarRepo extends JpaRepository<InstituteCalendar, Long> {

}
