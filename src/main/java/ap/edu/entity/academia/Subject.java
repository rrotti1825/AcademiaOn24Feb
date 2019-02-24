package ap.edu.entity.academia;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import ap.edu.entity.admission.Admission;
import ap.edu.entity.schedule.TestMarksTracker;
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
@Table(name="subject",
uniqueConstraints=
@UniqueConstraint(columnNames={"title", "type"})
)
public class Subject implements java.io.Serializable{
	
	@Id
	@Column(name="subject_id",length=20)
	String id;
	
	@Column(name="title",length=50)String title;			
	@Column(name="type",length=20) String type; // theory, practicals
	@Embedded ApplicationLogger dblog;

	@OneToMany(mappedBy="subject",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<CourseSubjects> courseSubjects=new HashSet<CourseSubjects>();
	
	@OneToMany(mappedBy="subject",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<AddonSubjects> addonSubjects=new HashSet<AddonSubjects>();
	

	@OneToMany(mappedBy="optedLanguage",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<Admission> languageOptedStudents=new HashSet<Admission>();	

	
	@OneToMany(mappedBy="subject",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<TestMarksTracker> testMarksTracker=new HashSet<TestMarksTracker>();

}
