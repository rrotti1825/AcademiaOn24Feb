package ap.edu.dao.academics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.academia.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, String>{

}
