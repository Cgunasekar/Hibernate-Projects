package onetoone;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Store {
private Session c;
Store(){
	c=Utility.getSession();
	Transaction t=c.beginTransaction();  //transfer value to sql
	
}
void values()throws HibernateException
{
	CustomerDetails j=new CustomerDetails();
	j.setCustomername("Niriksha");
	j.setAadharnumber(111122223333l);
	j.setAge(23);
	AirlinesTicket i=new AirlinesTicket();
	i.setTicketnumber(2122l);
	i.setArrival("Chennai");
	i.setDeparture("mumbai");
	j.setTicket(i);
	c.save(j);
	c.save(i);
	c.getTransaction().commit();
	c.close();
	System.out.println("Data is Stored");
}
	public static void main(String[] args) {
	try {
Store k=new Store();
k.values();
	}
catch(HibernateException l) {
	System.out.println(l);
}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
