package ap.edu.entity.util;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import ap.edu.entity.academia.Subject;
import ap.edu.entity.org.ComposedOrg;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="institute_calendar")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class InstituteCalendar implements Serializable{
	
	@Id
	
	@Column @DateTimeFormat(pattern="yyyy-MM-dd") Date id;
	

	int sessionsperday;
	boolean isWorkingDay;
	String remarks;


}
