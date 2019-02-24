package ap.edu.entity.admission;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
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

import org.springframework.format.annotation.DateTimeFormat;

import ap.edu.entity.academia.AddonCourse;
import ap.edu.entity.academia.Course;
import ap.edu.entity.org.ComposedOrg;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="admission",uniqueConstraints=
@UniqueConstraint(columnNames={"student_id", "course_id"})
)
public class Admission implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admission_generator")
	@SequenceGenerator(name="admission_generator", sequenceName = "admission_seq", initialValue=1001, allocationSize=1000)
	@Column(name="id",length=20)
	Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id", nullable = false)
    private Student studentPersonal;	

	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id", nullable = false)
	Course	course;
	
	@Column(name="opted_language",length=100) String optedLanguage;
	
	@Column(name="day_scholor") boolean isDayScholor;
	@Column(name="admission_type") String admissionType; //new or promoted
	@Column(name="joining_date") @DateTimeFormat(pattern="yyyy-MM-dd") Date joiningDate;
	@Column(name="status") String status;
	@Column(name="remarks") String Remarks;

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "addon_id", nullable = false)
	AddonCourse	addon;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "oic_id", nullable = false)
	ComposedOrg	oic;								//org-ins-camp
	
	

	
}
