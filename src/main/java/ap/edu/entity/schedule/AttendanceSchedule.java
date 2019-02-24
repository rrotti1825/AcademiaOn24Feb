package ap.edu.entity.schedule;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.format.annotation.DateTimeFormat;

import ap.edu.entity.academia.Course;
import ap.edu.entity.util.Facilitator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="attendance_schedule",
uniqueConstraints=
    @UniqueConstraint(columnNames={"section_id","startDate","endDate"})
)
public class AttendanceSchedule implements Serializable{
	
	@Id

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attendance_generator")
	@SequenceGenerator(name="attendance_generator", sequenceName = "attendance_seq", initialValue=1001, allocationSize=1000)
	@Column(name="attendance_scdule_id")
	Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "section_id", nullable = false)
	Section section;
	
	
	@Column(name="startDate") @DateTimeFormat(pattern="yyyy-MM-dd")Date startDate;
	@Column(name="endDate") @DateTimeFormat(pattern="yyyy-MM-dd")Date endDate;

	@Column(name="session_type",length=50) String	sessionType; //lab, theory, others
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "facilitator", nullable = false)
    Facilitator facilitator;



	

}
