package ap.edu.dao.academics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.academia.CourseSubjects;

@Repository
public interface CourseSubjectsRepo extends JpaRepository<CourseSubjects, Long>{

}
//
