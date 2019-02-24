package ap.edu.dao.org;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.org.Organization;

@Repository
public interface OrganizationRepo extends JpaRepository<Organization, String>{

}
