package ap.edu.dao.academics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.academia.AddonCourse;

@Repository
public interface AddonCourseRepo extends JpaRepository<AddonCourse, String> {

}
