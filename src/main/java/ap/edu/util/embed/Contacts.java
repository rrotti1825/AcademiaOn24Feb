package ap.edu.util.embed;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Email;

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
public class Contacts {
	
	@Column(name="mobile_no",length=10) String mobileNo;
	@Column (name="alternative_no",length=20) String alternativeNo; 
	@Column(name="email",length=100) @Email String email ;

}
