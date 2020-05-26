package pages;

public class GuestUser {
	String fn;
	String ln;
	String email;
	String passwrd;
	String mn;
	String add1;
	String add2;
	public GuestUser() {
	}
	public GuestUser(String fn, String ln, String email, String passwrd, String mn, String add1, String add2) {
		this.fn = fn;
		this.ln = ln;
		this.email = email;
		this.passwrd = passwrd;
		this.mn = mn;
		this.add1 = add1;
		this.add2 = add2;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswrd() {
		return passwrd;
	}
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}
	public String getMn() {
		return mn;
	}
	public void setMn(String mn) {
		this.mn = mn;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
}
