package ap.edu.dao.org;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.org.ComposedOrg;

@Repository
public interface ComposedOrgRepo extends JpaRepository<ComposedOrg, Long>{

}
