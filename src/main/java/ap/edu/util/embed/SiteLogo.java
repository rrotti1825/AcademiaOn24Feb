package ap.edu.util.embed;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embeddable;

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
public class SiteLogo {
	
	@Column(length=100) String website ; 
	@Column String logo ; 
	@Column(length=100) String logocategory ; 

}
