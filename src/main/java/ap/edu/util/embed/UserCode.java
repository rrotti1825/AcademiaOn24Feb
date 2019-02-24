package ap.edu.util.embed;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserCode {
	@Column(unique=true,length=10) @NotNull String code ;
	@Column(length=100) String name ; 
	@Column(length=100) String description;
}
