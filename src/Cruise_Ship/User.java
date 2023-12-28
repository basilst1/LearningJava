package Cruise_Ship;

public class User extends Cruise {
	
	
	
	
	 public User(String cruiseName, double adultRate, double childRate, int minAge) {
		super(cruiseName, adultRate, childRate, minAge);
		// TODO Auto-generated constructor stub
	}

	private String username;
	    private String password;
	    private String fullName;
	    private String phoneNumber;

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getFullName() {
	        return fullName;
	    }

	    public void setFullName(String fullName) {
	        this.fullName = fullName;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }
	}

	


	        
