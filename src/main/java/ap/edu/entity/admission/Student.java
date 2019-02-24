package ap.edu.entity.admission;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import ap.edu.util.embed.Address;
import ap.edu.util.embed.Contacts;
import ap.edu.util.embed.Name;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student implements Serializable{
	
	@Id
	@Column(name="student_id",length=20)
	Long id ; 
	
	@Embedded Name name;
	String Gender;
	@Column @DateTimeFormat(pattern="yyyy-MM-dd") Date dob;		
	String fatherName;
	String motherName;
	String gaurdianName;
	String religion;
	String caste;
	String bloodGroup;
	String motherTongue;
	
	@Embedded Address address;
	@Embedded Contacts contacts;

	@OneToMany(mappedBy="studentPersonal",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<Admission> admisiondetails=new HashSet<Admission>();
	

//	@OneToMany(mappedBy="studentAdmission",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	Set<Academics> definedAcademics=new HashSet<Academics>();
//	
//	
//	@OneToMany(mappedBy="studentAdmission",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	Set<AssignedFee> definedFeeses=new HashSet<AssignedFee>();
//	
//	@OneToMany(mappedBy="studentAdmission",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	Set<Tracker> studentTracker=new HashSet<Tracker>();	

	
	
	
}
