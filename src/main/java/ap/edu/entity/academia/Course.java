package ap.edu.entity.academia;

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

import ap.edu.entity.admission.Admission;
import ap.edu.entity.finance.HeadGroup;
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

@Table(name="course_term",
uniqueConstraints=
    @UniqueConstraint(columnNames={"stream_specialization", "term"})
)
public class Course implements java.io.Serializable { // puc-1, Bsc-1, Bcom-1, Engg, Medical
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_generator")
	@SequenceGenerator(name="course_generator", sequenceName = "course_seq", initialValue=101, allocationSize=1000)
	Long id ;
	
	@Column(name = "term")					int term;

	@Column(name = "numberOfCoreSubjects")	int numberOfCoreSubjects;
	@Column(name = "numberOfLanguages")		int numberOfLanguages;
	@Column(name = "numberOfElectives")		int numberOfElectives;
	@Column(name = "numberOfPracticals")	int numberOfPracticals;

	@Embedded
	ApplicationLogger dblog;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "stream_specialization", nullable = false)
	StreamSpecialization streamSpecialization;

	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	Set<CourseSubjects> subjects = new HashSet<CourseSubjects>();

	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	Set<HeadGroup> feeGroups = new HashSet<HeadGroup>();

		@OneToMany(mappedBy="course",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
		Set<Admission> students=new HashSet<Admission>();	

}
