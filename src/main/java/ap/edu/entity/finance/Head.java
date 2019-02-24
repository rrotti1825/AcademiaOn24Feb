package ap.edu.entity.finance;

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
@Table(name="head")
public class Head implements Serializable{
	
	@Id
	@Column(name="head_id",length=20)
	String id ; 
	
	@Column(name = "code",unique=true,length=10) @NotNull String code ;
	@Column(name = "name",length=100) String name ; 
	@Column(name = "description",length=100) String description;
	
	@OneToMany(mappedBy="head",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set <HeadAmount> feeses=new HashSet<HeadAmount>();
	
	@Embedded ApplicationLogger dblog;

}
