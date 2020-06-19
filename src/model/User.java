package model;

public class User{
      String name;
      static String dob;
      String gender;
      
	public User(String name,String dob, String gender) {
		super();
		this.name = name;
		User.dob = dob;
		this.gender = gender;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		User.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
      
}

