package ap.edu.entity.academia;

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

import ap.edu.entity.admission.Admission;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString

@Table(name="addon_course",
uniqueConstraints=
    @UniqueConstraint(columnNames={"stream_specialization", "term"})
)

public class AddonCourse {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addon_generator")
	@SequenceGenerator(name="addon_generator", sequenceName = "addon_seq", initialValue=101, allocationSize=1000)
	Long id ;

	@Column(name = "term")	int term;
	
	@Column(length = 100)
	String name;
	
	@Column(length = 100)
	String description;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "stream_specialization", nullable = false)
	StreamSpecialization streamSpecialization;

	@OneToMany(mappedBy = "addon", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	Set<AddonSubjects> subjects = new HashSet<AddonSubjects>();

	@OneToMany(mappedBy="addon",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<Admission> students=new HashSet<Admission>();

}
