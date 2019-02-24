package ap.edu.entity.academia;

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
@Table(name="course_subjects",
uniqueConstraints=
    @UniqueConstraint(columnNames={"course_id", "subject_id"})
)
public class CourseSubjects implements java.io.Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_subjects_generator")
	@SequenceGenerator(name="course_subjects_generator", sequenceName = "course_subjects_seq", initialValue=1001, allocationSize=1000)
	@Column(name="id")
	Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id", nullable = false)
	Course course;


	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subject_id", nullable = false)
	Subject subject;
	
	@Column(name="is_elective") boolean isElective;// core or elective
	
	@Column(name="max_marks") int maxMarks;
	@Column(name="passing_percentage") int passingPercentage;
	@Column(name="remarks") String remarks;
	
	@Embedded ApplicationLogger dblog;

}
