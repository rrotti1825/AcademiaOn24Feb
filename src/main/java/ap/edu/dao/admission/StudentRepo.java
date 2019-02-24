package ap.edu.dao.admission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.admission.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

}
