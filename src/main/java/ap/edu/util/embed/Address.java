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
public class Address {
	
	@Column(length=50) String line1 ;
	@Column(length=50) String line2 ;
	@Column(length=25) String city ; 
	@Column(length=25) String district; 
	@Column(length=25) String state ; 
	@Column(length=10) String pincode ; 	
	


}
