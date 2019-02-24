package ap.edu.dao.academics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.academia.StreamSpecialization;

@Repository
public interface StreamSpecializationRepo extends JpaRepository<StreamSpecialization, Long>{

}
