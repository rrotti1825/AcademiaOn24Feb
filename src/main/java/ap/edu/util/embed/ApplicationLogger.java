package ap.edu.util.embed;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.springframework.format.annotation.DateTimeFormat;

import ap.edu.entity.org.ComposedOrg;
import ap.edu.entity.org.Facility;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ApplicationLogger {
	
	@Column(length=25) String createdBy;
	@Column @DateTimeFormat(pattern="yyyy-MM-dd") Date createdDate;  
	@Column(length=25) String updatedBy;
	@Column @DateTimeFormat(pattern="yyyy-MM-dd") Date updatedDate; 
	@Column(length=10) String status ; 

}
