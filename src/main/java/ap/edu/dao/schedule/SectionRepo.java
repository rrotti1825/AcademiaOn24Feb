package ap.edu.dao.schedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.schedule.Section;

@Repository
public interface SectionRepo extends JpaRepository<Section, String>{

}
