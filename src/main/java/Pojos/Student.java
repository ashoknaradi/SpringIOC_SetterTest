package Pojos;

public class Student {
	private int sId;
	private String sName;
	private String sCollege;
	private Passport passport;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsCollege() {
		return sCollege;
	}

	public void setsCollege(String sCollege) {
		this.sCollege = sCollege;
	}
}
