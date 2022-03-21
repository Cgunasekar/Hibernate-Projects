package onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data  //getter setter
@NoArgsConstructor //default constructor
@AllArgsConstructor //parameterized
@Entity
@Table 
public class CustomerDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerid;
private String customername;
private long aadharnumber;
private int age;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="customerid") //
private AirlinesTicket ticket;
}
