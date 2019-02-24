package ap.edu.entity.schedule;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.format.annotation.DateTimeFormat;

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
@Table(name="attendance_tracker",
uniqueConstraints=
    @UniqueConstraint(columnNames={"student_id", "date","is_present"})
)
public class AttendanceTracker implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="attendance_tracker_id")
	Long id;	
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id", nullable = false)
	Tracker track;
	
	@Column(name="date") @DateTimeFormat(pattern="yyyy-MM-dd") Date date;
	
	@Column(name="is_present")boolean isPresent;


}
