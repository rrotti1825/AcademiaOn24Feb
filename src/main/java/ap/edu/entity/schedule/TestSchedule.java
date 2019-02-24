package ap.edu.entity.schedule;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
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

import ap.edu.entity.academia.CourseSubjects;
import ap.edu.util.embed.UserCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="test_schedule",
uniqueConstraints=
@UniqueConstraint(columnNames={"section_id","startDate","endDate"})
)
public class TestSchedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_generator")
	@SequenceGenerator(name="test_generator", sequenceName = "test_seq", initialValue=1001, allocationSize=1000)
	@Column(name="test_schedule_id")
	Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "section_id", nullable = false)
	Section section;
	
	@Column(name="title",length=50)String title;
	
	@Column(name="startDate") @DateTimeFormat(pattern="yyyy-MM-dd")Date startDate;
	@Column(name="endDate") @DateTimeFormat(pattern="yyyy-MM-dd")Date endDate;
	
	@Column(name="schedule_all_subjects",length=10) boolean scheduleAllSubjects; // core or all 
	
	@Column(name="assessmentType",length=20) String	assessmentType; //objective, descriptive
	
	@OneToMany(mappedBy="testSchedule",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<TestMarksTracker> subjectsMarks=new HashSet<TestMarksTracker>();
	
	@OneToMany(mappedBy="testSchedule",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<TotalMarksTracker> totalMarks=new HashSet<TotalMarksTracker>();
	


}
