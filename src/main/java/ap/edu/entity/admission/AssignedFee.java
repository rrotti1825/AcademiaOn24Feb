package ap.edu.entity.admission;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import ap.edu.entity.finance.HeadAmount;
import ap.edu.util.embed.ApplicationLogger;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="student_fee_structure",
uniqueConstraints=
@UniqueConstraint(columnNames={"student_id", "fee_structure_id"})
)
public class AssignedFee implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "feestruct_generator")
	@SequenceGenerator(name="feestruct_generator", sequenceName = "feestruct_seq", initialValue=1001, allocationSize=1000)
	@Column(name="id",length=20)
	Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id", nullable = false)
	Admission studentAdmission;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fee_structure_id", nullable = false)
	HeadAmount headValue;
	
	@Embedded ApplicationLogger dblog;
	
	




}
