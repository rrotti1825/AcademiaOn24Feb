package ap.edu.entity.admission;

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

import ap.edu.entity.schedule.AttendanceTracker;
import ap.edu.entity.schedule.Section;
import ap.edu.entity.schedule.TestMarksTracker;
import ap.edu.entity.schedule.TotalMarksTracker;
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
public class Tracker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tracker_generator")
	@SequenceGenerator(name="tracker_generator", sequenceName = "tracker_seq", initialValue=1001, allocationSize=1000)
	@Column(name="id",length=20)
	Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id", nullable = false)
	Admission studentAdmission;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "section_id", nullable = false)
	Section section;
	
	@OneToMany(mappedBy="track",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<AttendanceTracker> attendaces=new HashSet<AttendanceTracker>();

	@OneToMany(mappedBy="track",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<TestMarksTracker> testSubjectScores=new HashSet<TestMarksTracker>();
	
	@OneToMany(mappedBy="track",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<TotalMarksTracker> testTotalScores=new HashSet<TotalMarksTracker>();

}
