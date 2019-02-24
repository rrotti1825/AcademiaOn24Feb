package ap.edu.entity.org;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import ap.edu.entity.finance.HeadGroup;
import ap.edu.util.embed.Address;
import ap.edu.util.embed.ApplicationLogger;
import ap.edu.util.embed.Contacts;
import ap.edu.util.embed.SiteLogo;
import ap.edu.util.embed.UserCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="institution")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Institution implements Serializable{
	@Id
	@Column(length=10)
	String  id;

	@Column(unique=true,length=10) @NotNull String code ;
	@Column(length=100) String name ; 
	@Column(length=100) String description;
	@Embedded Address address;
	@Embedded Contacts contacts; 
	@Embedded ApplicationLogger dblog;
	@Embedded SiteLogo site;
	

	@OneToMany(mappedBy="institution", cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)	  
    private Set<ComposedOrg> oics = new HashSet<ComposedOrg>();
	
	@OneToMany(mappedBy="institution", cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)	  
   	Set<HeadGroup> definedFees=new HashSet<HeadGroup>();

	

    
}
