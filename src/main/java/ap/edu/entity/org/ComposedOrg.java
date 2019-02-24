package ap.edu.entity.org;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


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
@Table(name="composed_org",
	    uniqueConstraints=
	        @UniqueConstraint(columnNames={"org", "institution","camp"})
	)
public class ComposedOrg implements Serializable{
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "composed_org_generator")
	@SequenceGenerator(name="composed_org_generator", sequenceName = "composed_org_seq", initialValue=101, allocationSize=1000)
	Long id;
	
	@Embedded ApplicationLogger dblog;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "org", nullable = false)
	Organization org;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "institution", nullable = false)
	Institution institution;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "camp", nullable = false)
	Campus camp;

	
//	@OneToMany(mappedBy="oic",cascade = CascadeType.ALL,
//            fetch = FetchType.EAGER)	
//	Set<Admission> students=new HashSet<Admission>();
	
	
	

}
