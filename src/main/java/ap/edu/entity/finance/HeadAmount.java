package ap.edu.entity.finance;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="head_amount",
uniqueConstraints=
    @UniqueConstraint(columnNames={"head_group", "head_id"})
)
public class HeadAmount {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "head_amount_generator")
	@SequenceGenerator(name="head_amount_generator", sequenceName = "head_amount_seq", initialValue=1001, allocationSize=1000)
	@Column(name="id")
	Long id ; 
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "head_group", nullable = false)
	HeadGroup feeGroup;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "head_id", nullable = false)
	Head head;
	
	@Column(name="amount",length=6) int amount;
	
//	@OneToMany(mappedBy="feeStructure",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	Set<AssignedFee> studentFeeses=new HashSet<AssignedFee>();

	
	@Embedded ApplicationLogger dblog;

}
