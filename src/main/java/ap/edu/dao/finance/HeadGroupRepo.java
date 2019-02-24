package ap.edu.dao.finance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.finance.HeadGroup;

@Repository
public interface HeadGroupRepo extends JpaRepository<HeadGroup, Long>{

}
