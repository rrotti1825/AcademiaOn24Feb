package ap.edu.dao.finance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.finance.Head;

@Repository
public interface HeadRepo extends JpaRepository<Head, Long>{

}
