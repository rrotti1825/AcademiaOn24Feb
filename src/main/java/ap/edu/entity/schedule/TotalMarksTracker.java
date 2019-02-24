package ap.edu.entity.schedule;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ap.edu.entity.academia.Subject;
import ap.edu.entity.admission.Admission;
import ap.edu.entity.admission.Student;
import ap.edu.entity.admission.Tracker;
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
@Table(name="total_marks_tracker")
public class TotalMarksTracker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;	
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student", nullable = false)
	Tracker track;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "schedule_id", nullable = false)
	TestSchedule testSchedule;
	
	int maxMarks;	
	int securedMarks;
	int overallRank;


}
