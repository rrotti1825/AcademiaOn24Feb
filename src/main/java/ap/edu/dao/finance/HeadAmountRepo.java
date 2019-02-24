package ap.edu.dao.finance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.edu.entity.finance.HeadAmount;

@Repository
public interface HeadAmountRepo extends JpaRepository<HeadAmount, Long>{

}
