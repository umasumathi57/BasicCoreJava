package excerice.console.SriumaJava;

public class Model {
	
public Model(String username, Long mobno) {
		super();
		this.username = username;
		Mobno = mobno;
	}
public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
private	String username;
Long Mobno;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Long getMobno() {
	return Mobno;
}
public void setMobno(Long mobno) {
	Mobno = mobno;
}
@Override
public String toString() {
	return "Model [username=" + username + ", Mobno=" + Mobno + ", getUsername()=" + getUsername() + ", getMobno()="
			+ getMobno() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}


}
