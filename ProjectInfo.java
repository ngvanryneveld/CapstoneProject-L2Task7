package task7;

// class declaration of variables
public class ProjectInfo {
	int projectNumber;
	String projectName;
	String buildingType;
	String projectAddress;
	int erfNumber;
	double projectFee;
	double paidToDate;
	String deadlineDate;

	// blank constructor
	ProjectInfo() {
	}
	
	// constructor with variables and arguments
	public ProjectInfo(int projectNumber, String projectName, String buildingType, String projectAddress, int erfNumber, double projectFee, double paidToDate, String deadlineDate) {
		
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.projectAddress = projectAddress;
		this.erfNumber = erfNumber;
		this.projectFee = projectFee;
		this.paidToDate = paidToDate;
		this.deadlineDate = deadlineDate;

		
	}

	// getters and setters for the variables of a project/constructors variables
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String newProjectName) {
		projectName = newProjectName;	
	}
	
	public int getProjectNumber() {
		return projectNumber;
	}
	
	public void setProjectNumber(int newProjectNumber) {
		projectNumber = newProjectNumber;
	}
	
	public String getBuildingType() {
		return buildingType;
	}
	
	public void setBuildingType(String newBuildingType) {
		buildingType = newBuildingType;
	}
	
	public String getProjectAddress() {
		return projectAddress;
	}
	
	public void setProjectAddress(String newProjectAddress) {
		projectAddress = newProjectAddress;
	}
	
	public int getERFNumber() {
		return erfNumber;
	}
	
	public void setERFNumber(int newERFNumber) {
		erfNumber = newERFNumber;
	}
	
	public double getProjectFee() {
		return projectFee;
	}
	
	public void setProjectFee(double newProjectFee) {
		projectFee = newProjectFee;
	}
	
	public double getPaidToDate() {
		return paidToDate;
	}
	
	public void setPaidToDate(double newPaidToDate) {
		paidToDate = newPaidToDate;
	}
	
	public String getProjectDeadline() {
		return deadlineDate;
	}
	
	public void setProjectDeadline(String newProjectDeadline) {
		deadlineDate = newProjectDeadline;
	}

	// toString method for ProjectInfo so that it can be read in a readable manner.
	public String toString() {
		String output = "Project Number: " + projectNumber;
		output += "\nProject Name: " + projectName;
		output += "\nBuilding Type: " + buildingType;
		output += "\nProject Address: " + projectAddress;
		output += "\nERF Number: " + erfNumber;
		output += "\nProject Fee: " + projectFee;
		output += "\nAmount Paid to Date: " + paidToDate;
		output += "\nProject Deadline: " + deadlineDate + "\n";
		
		return output;
	}

}
