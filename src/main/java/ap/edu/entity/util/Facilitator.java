package ap.edu.entity.util;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import ap.edu.entity.org.ComposedOrg;
import ap.edu.entity.org.Facility;
import ap.edu.entity.schedule.AttendanceSchedule;
import ap.edu.util.embed.Address;
import ap.edu.util.embed.ApplicationLogger;
import ap.edu.util.embed.Contacts;
import ap.edu.util.embed.Name;
import ap.edu.util.embed.UserCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "facilitator")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Facilitator {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "facilitator_generator")
	@SequenceGenerator(name="facilitator_generator", sequenceName = "facilitator_seq", initialValue=101, allocationSize=1000)
	Long id;
	
	@Embedded Name name;
	@Embedded Address address;
	@Embedded Contacts contacts;
	@Embedded ApplicationLogger dblog;
	
	 
	
	@OneToMany(mappedBy="facilitator",cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private Set<AttendanceSchedule> attendanceSchedules=new HashSet<AttendanceSchedule>();
}
