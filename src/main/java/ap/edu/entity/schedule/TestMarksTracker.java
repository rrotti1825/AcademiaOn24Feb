package ap.edu.entity.schedule;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import ap.edu.entity.academia.Subject;
import ap.edu.entity.admission.Admission;
import ap.edu.entity.admission.Tracker;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="subject_marks_tracker",
uniqueConstraints=
    @UniqueConstraint(columnNames={"student_id","test_schedule_id","subject_id"})
)
public class TestMarksTracker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="marks_tracker_id")
	Long id;	
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id", nullable = false)
	Tracker track;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "test_schedule_id", nullable = false)
	TestSchedule testSchedule;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subject_id", nullable = false)
	Subject subject;
	
	@Column(name="max_marks") int maxMarks;	
	@Column(name="is_present")  boolean isPresent;
	@Column(name="secured_marks") int securedMarks;
	@Column(name="subject_rank") int subjectRank;

}
