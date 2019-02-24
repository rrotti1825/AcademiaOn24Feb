package ap.edu.dao.academics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.academia.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, String>{

}