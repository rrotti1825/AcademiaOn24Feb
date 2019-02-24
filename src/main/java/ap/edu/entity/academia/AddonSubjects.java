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
@Table(name="addon_subjects",
uniqueConstraints=
    @UniqueConstraint(columnNames={"addon_id", "subject_id"})
)
public class AddonSubjects {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addon_subjects_generator")
	@SequenceGenerator(name="addon_subjects_generator", sequenceName = "addon_subjects_seq", initialValue=1001, allocationSize=1000)
	@Column(name="id")
	Long id;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "addon_id", nullable = false)
	AddonCourse addon;
	

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subject_id", nullable = false)
	Subject subject;
	
	
	@Embedded ApplicationLogger dblog;

}
