package ap.edu.entity.schedule;



import java.io.Serializable;
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
import javax.validation.constraints.NotNull;

import ap.edu.entity.admission.Admission;
import ap.edu.entity.admission.Tracker;
import ap.edu.util.embed.ApplicationLogger;
import ap.edu.util.embed.UserCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="section")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Section implements Serializable{
	
	@Id
	@Column(name="section_id",length=20)
	String id;
	
	@Column(unique=true,length=10) @NotNull String code ;
	@Column(length=100) String name ; 
	@Column(length=100) String description;
	
	@OneToMany(mappedBy="section",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<Tracker> students=new HashSet<Tracker>();
	
	
	@OneToMany(mappedBy="section",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<AttendanceSchedule> attendanceSchedules=new HashSet<AttendanceSchedule>();
	
	@OneToMany(mappedBy="section",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<TestSchedule> testSchedules=new HashSet<TestSchedule>();
	
	@Embedded ApplicationLogger dblog;
	

}
