package hb;

public class Author {
	  String AName;
	  String Email;
	  String gender;
	public String getAName() {
		return AName;
	}
	public void setAName(String aName) {
		AName = aName;
	}
	public Author(String aName, String email, String gender) {
		super();
		AName = aName;
		Email = email;
		this.gender = gender;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Author [AName=" + AName + ", Email=" + Email + ", gender=" + gender + "]";
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
