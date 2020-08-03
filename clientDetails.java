package task7;

// class declaration of variables
public class clientDetails {
	String name;
	String telephoneNumber;
	String emailAddress;
	String physicalAddress;
	
	// blank constructor
	clientDetails(){
	}
	
	// constructor made for the classes arguments inclusion of the variables
	public clientDetails(String name, String telephoneNumber, String emailAddress, String physicalAddress) {
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
	}
	
	// getters and setters of the variables of clientDetails
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

	// toString method so the details of the client can be printed out appropriately
	public String toString() {
		String output = "The client's name is " + name;
		output += "\nThe client's telephone number is " + telephoneNumber;
		output += "\nThe client's email address is " + emailAddress;
		output += "\nThe client's physical address is " + physicalAddress;

		return output;
	}
	
	public static void main(String[] args) {
	

	}

}
