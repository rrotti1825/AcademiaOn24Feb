package ap.edu.dao.academics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.academia.AddonSubjects;

@Repository
public interface AddonSubjectsRepo extends JpaRepository<AddonSubjects, Long> {

}
