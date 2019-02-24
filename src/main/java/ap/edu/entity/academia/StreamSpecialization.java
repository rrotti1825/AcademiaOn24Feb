package ap.edu.entity.academia;

import java.io.Serializable;
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
import javax.persistence.OneToMany;
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
@Table(name="stream_specialization",
uniqueConstraints=
    @UniqueConstraint(columnNames={"stream", "descipline","specialization","board"})
)
public class StreamSpecialization implements Serializable{//puc, Bsc, Bcom, Engg-mech, Medical
	
	@Id
	@Column(name="stream_specialization_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stream_generator")
	@SequenceGenerator(name="stream_generator", sequenceName = "stream_seq", initialValue=101, allocationSize=1000)
	Long id ; 
	
	@Column(name="stream",length=100) String stream ; 
	@Column(name="descipline",length=20) String descipline;
	@Column(name="specialization",length=50) String specialization;
	@Column(name="board",length=50) String board;		
	@Column(name="programType",length=20) String programType;//Annual, semester, trimester
	@Column(name="duration",length=20) int duration; //number of years / semesters
	
	
	@OneToMany(mappedBy="streamSpecialization",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<Course> courses=new HashSet<Course>();
	
	@OneToMany(mappedBy="streamSpecialization",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<AddonCourse> addOnCourse=new HashSet<AddonCourse>();

	
	@Embedded ApplicationLogger dblog;

}
