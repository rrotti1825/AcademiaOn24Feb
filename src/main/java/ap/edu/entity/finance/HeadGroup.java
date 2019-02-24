package ap.edu.entity.finance;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import ap.edu.entity.academia.Course;
import ap.edu.entity.org.Institution;
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
@Table(name="head_group",
	    uniqueConstraints=
	        @UniqueConstraint(columnNames={"academicYear", "admissionType","institution_id","course_id"})
	)
public class HeadGroup {
	@Id
	@Column(name="head_group",length=20)
	String id ; 
	
	@Column(name = "code",unique=true,length=10) @NotNull String code ;
	@Column(name = "name",length=20) String name ; 
	@Column(name = "description",length=20) String description;
	
	@Column(name = "academicYear",nullable=false,length=20) String academicYear;
	@Column(name = "admissionType",nullable=false,length=20) String admissionType;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "institution_id", nullable = false)
	Institution institution;	
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id", nullable = false)
	Course course;
	
	@OneToMany(mappedBy="feeGroup",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set <HeadAmount> feeses=new HashSet<HeadAmount>();
	

	@Embedded ApplicationLogger dblog;

}
