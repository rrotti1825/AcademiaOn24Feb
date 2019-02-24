package ap.edu.entity.admission;

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

import ap.edu.entity.academia.CourseSubjects;

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
@UniqueConstraint(columnNames={"student_id", "subjectref"})
)
public class Academics {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "academic_generator")
	@SequenceGenerator(name="academic_generator", sequenceName = "academic_seq", initialValue=1001, allocationSize=1000)
	@Column(name="id",length=20)
	Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id", nullable = false)
	Admission studentAdmission;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subjectref", nullable = false)
	CourseSubjects courseSubject;
	
	@Embedded ApplicationLogger dblog;
	

	
	
	

}
