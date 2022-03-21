package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data  //getter setter
@NoArgsConstructor //default constructor
@AllArgsConstructor //parameterized constructor
@Entity
@Table
public class AirlinesTicket {
	@Id
private long ticketnumber;
private String arrival;
private String departure;

}
