package task7;

// declaration of variables for the contractor
public class contractorDetails {
	String name;
	String telephoneNumber;
	String emailAddress;
	String physicalAddress;
	
	//blank constructor
	contractorDetails(){
	}
	
	//constructor with arguments and variables in place
	public contractorDetails(String name, String telephoneNumber, String emailAddress, String physicalAddress) {
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
	}
	
	// getters and setters for each variable of the class
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
	
	// toString method for the customers details to be printed out appropriately
	public String toString() {
		String output = "The contractor's name is " + name;
		output += "\nThe contractor's telephone number is " + telephoneNumber;
		output += "\nThe contractor's email address is " + emailAddress;
		output += "\nThe contractor's physical address is " + physicalAddress;

		return output;
	}
	
	public static void main(String[] args) {


	}

}
