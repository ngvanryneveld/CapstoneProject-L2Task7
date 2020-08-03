package task7;

//variables for the architect declared
public class architectDetails {
	String name;
	String telephoneNumber;
	String emailAddress;
	String physicalAddress;
	
	//blank constructor
	architectDetails(){
	}
	
	//constructor that will take the arguments and place the variables of the architect object
	public architectDetails(String name, String telephoneNumber, String emailAddress, String physicalAddress) {
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
	}
	
	//getters and setters for the variables in this class
	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String newTelephoneNumber) {
		telephoneNumber = newTelephoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String newEmailAddress) {
		emailAddress = newEmailAddress;
	}

	public String getPhyscialAddress() {
		return physicalAddress;
	}

	public void setPhyscialAddress(String newPhysicalAddress) {
		physicalAddress = newPhysicalAddress;
	}

	//toString method to print out the architects details
	public String toString() {
		String output = "The architect's name is " + name;
		output += "\nThe architect's telephone number is " + telephoneNumber;
		output += "\nThe architect's email address is " + emailAddress;
		output += "\nThe architect's physical address is " + physicalAddress;

		return output;
	}
	
	public static void main(String[] args) {

		
	}

}
