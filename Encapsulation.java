package project2;

public class Encapsulation {
public static final char[] setAccno = null;
private long accno;
private String name;
private String email;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getAccno() {
	return accno;
}

private void setAccno(long accno) {
	this.accno=accno;
}
public static void main(String[] args) {
	Encapsulation e=new Encapsulation();
	e.setName( "ruk");
	 e.setAccno(123456789L );
	 e.setEmail("ruksana.syed@gmail.com");
	System.out.println(e.getName()+" "+e.getEmail()+" "+e.getAccno());
	

 

	
}

	
}




	


