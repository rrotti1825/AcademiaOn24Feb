package ap.edu.entity.org;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "facility")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Facility {
	@Id
	@Column(length=10)
	String id;
	
	@Column(unique=true,length=10) @NotNull String code ;
	@Column(length=100) String name ; 
	@Column(length=100) String description;
	
	@Column(length=10)String type;
	@Column(length=100)String features;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "camp_id", nullable = false)
	Campus camp;
	

}
