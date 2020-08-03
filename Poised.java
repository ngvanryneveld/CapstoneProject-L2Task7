package task7;

/// import .* means imports all features of .io and .utils
import java.io.*;
import java.util.*;

public class Poised {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Scanner sc = new Scanner(System.in);

		// program starts with appropriate printing of information and then allows the user to create a new project, client, contractor and architect 
		
		System.out.println("Welcome to the Poised Program for Project Information Storage System.");
    	System.out.println("As this is your first time starting the program, you need to add new information before using any of the controls.");
   	


		System.out.println("Let us start with a new project. ");
	  	ProjectInfo firstProject = createProject();
	  	
		System.out.println("Let us add a new client. ");
		clientDetails firstClient = createClient();
		
		System.out.println("Let us add a new contractor. ");
		contractorDetails firstContractor = createContractor();
		
		System.out.println("Let us add a new architect. ");
		architectDetails firstArchitect = createArchitect();  


    	
    	// while true statement runs the program continuously until it is broken, so the menu keeps coming up and the user can continue to select options
    	
		while (true) {
			// user input to select an option from the menu shown, each option has a function within
			menuOption();
			int systemInput = sc.nextInt();

			// creates a new project for the user from inputs
			if (systemInput == 1) {
				ProjectInfo newProject = createProject();
				System.out.println("Would you like to view your new project, input yes or no. ");
				String view = sc.next();
				if (view == "yes") {
					System.out.println(newProject.toString());
				}
			}
			
			// edits the current project and allows for more specification of what is being changed
			if (systemInput == 2) {
				System.out.println("Editing the current project: \nEnter 0 to go to previous menu.\n");
				editProject(firstProject);
			}
	
			// views the current project through toString method
			if (systemInput == 3) {
				System.out.println("Viewing the current project.");
				System.out.println(firstProject.toString());
				System.out.println("Enter 'b' to return to the main menu.");
				String goback = sc.next();
				if (goback == "b") {
				}
			}
			
			// functions regarding dealing with the client, creating/viewing/editing - done through user input and prints out various parts accordingly
			if (systemInput == 4) {
				System.out.println("If you would like to add a new client, input 1. ");
				System.out.println("If you would like view a current client, input 2. ");
				System.out.println("If you would like edit a current client, input 3. ");
				int addEditView = sc.nextInt();
				
				// calls createClient function and then prints out
				if (addEditView == 1) {				
					clientDetails newClient = createClient();
					System.out.println("\nNew client added: \n" + newClient.toString() + "\n");
				}
				// calls the toString method and prints out
				if (addEditView == 2) {
					System.out.println(firstClient.toString() + "\n\nWhen you are done, enter 'b' to go back to main menu. \n");
					String goback = sc.next();
					if (goback == "b") {
					}
				}
				// calls various options available for editing the client 
				if (addEditView == 3) {
					System.out.println("If you would like edit clients name, input 1. ");
					System.out.println("If you would like edit clients telephone number, input 2. ");
					System.out.println("If you would like edit clients email address, input 3. ");
					System.out.println("If you would like edit clients physcial address, input 4. ");
					int editOption = sc.nextInt();
					if (editOption == 1) {
						System.out.println("Please enter the new name: ");
						String newName = sc.next();
						firstClient.setName(newName);
					}
					else if (editOption == 2) {
						System.out.println("Please enter the new number: ");
						String newTelephoneNumber = sc.next();
						firstClient.setTelephoneNumber(newTelephoneNumber);
					}
					else if (editOption == 3) {
						System.out.println("Please enter the new email address: ");
						String newEmailAddress = sc.next();
						firstClient.setEmailAddress(newEmailAddress);
					}
					else if (editOption == 4) {
						System.out.println("Please enter the new physcial address (Capitalised with no spaces in between): ");
						String newPhysicalAddress = sc.next();
						firstClient.setPhyscialAddress(newPhysicalAddress);
					}
					System.out.println(firstClient.toString());
					System.out.println("\nEnter 'b' to go back to main menu. ");
					String goback = sc.next();
					if (goback == "b") {
					}
				}
			}
			
			// functions regarding dealing with the contractor, creating/viewing/editing - done through user input and prints out various parts accordingly
			if (systemInput == 5) {
				System.out.println("If you would like to add a new contractor, input 1. ");
				System.out.println("If you would like view a current contractor, input 2. ");
				System.out.println("If you would like edit a current contractor, input 3. ");
				int addEditView = sc.nextInt();
				// calls createContractor and prints out with toString
				if (addEditView == 1) {				
					contractorDetails newContractor = createContractor();
					System.out.println("\nNew client added: \n" + newContractor.toString() + "\n");
				}
				// displays through toString method of contractor
				if (addEditView == 2) {
					System.out.println(firstContractor.toString() + "\n\nWhen you are done, enter 'b' to go back to main menu. \n");
					String goback = sc.next();
					if (goback == "b") {
					}
				}
				// goes further into the editing of what particular element would like to be edited thorugh setters
				if (addEditView == 3) {
					System.out.println("If you would like edit clients name, input 1. ");
					System.out.println("If you would like edit clients telephone number, input 2. ");
					System.out.println("If you would like edit clients email address, input 3. ");
					System.out.println("If you would like edit clients physcial address, input 4. ");
					int editOption = sc.nextInt();
					if (editOption == 1) {
						System.out.println("Please enter the new name: ");
						String newName = sc.next();
						firstContractor.setName(newName);
					}
					else if (editOption == 2) {
						System.out.println("Please enter the new number: ");
						String newTelephoneNumber = sc.next();
						firstContractor.setTelephoneNumber(newTelephoneNumber);
					}
					else if (editOption == 3) {
						System.out.println("Please enter the new email address: ");
						String newEmailAddress = sc.next();
						firstContractor.setEmailAddress(newEmailAddress);
					}
					else if (editOption == 4) {
						System.out.println("Please enter the new physical address (Capitlised with no spaces in between): ");
						String newPhysicalAddress = sc.next();
						firstContractor.setPhyscialAddress(newPhysicalAddress);
					}
					System.out.println(firstContractor.toString() + "\nEnter 'b' to go back to main menu. ");
					String goback = sc.next();
					if (goback == "b") {
					}
				}
			}
			
			// functions regarding dealing with the architect, creating/viewing/editing - done through user input and prints out various parts accordingly
			if (systemInput == 6) {
				System.out.println("If you would like to add a new architect, input 1. ");
				System.out.println("If you would like view a current architect, input 2. ");
				System.out.println("If you would like edit a current architect, input 3. ");
				int addEditView = sc.nextInt();
				// calls createArchitect function and prints out after created
				if (addEditView == 1) {				
					architectDetails newArchitect = createArchitect();
					System.out.println("\nNew client added: \n" + newArchitect.toString() + "\n");
				}
				// uses toString method to display the architect
				if (addEditView == 2) {
					System.out.println(firstArchitect.toString() + "\n\nWhen you are done, enter 'b' to go back to main menu. \n");
					String goback = sc.next();
					if (goback == "b") {
					}
				}
				// edits the current architect but allows the user to select what is being edited
				if (addEditView == 3) {
					System.out.println("If you would like edit clients name, input 1. ");
					System.out.println("If you would like edit clients telephone number, input 2. ");
					System.out.println("If you would like edit clients email address, input 3. ");
					System.out.println("If you would like edit clients physcial address, input 4. ");
					int editOption = sc.nextInt();
					if (editOption == 1) {
						System.out.println("Please enter the new name: ");
						String newName = sc.next();
						firstArchitect.setName(newName);
					}
					else if (editOption == 2) {
						System.out.println("Please enter the new number: ");
						String newTelephoneNumber = sc.next();
						firstArchitect.setTelephoneNumber(newTelephoneNumber);
					}
					else if (editOption == 3) {
						System.out.println("Please enter the new email address: ");
						String newEmailAddress = sc.next();
						firstArchitect.setEmailAddress(newEmailAddress);
					}
					else if (editOption == 4) {
						System.out.println("Please enter the new physical address (Capitalised with no spaces in between): ");
						String newPhysicalAddress = sc.next();
						firstArchitect.setPhyscialAddress(newPhysicalAddress);
					}
					System.out.println(firstArchitect.toString());
					System.out.println("\nEnter 'b' to go back to main menu. ");
					String goback = sc.next();
					if (goback == "b") {
					}
				}
			}
			
			// finalises a project through the finalise() function
			if (systemInput == 7) {
				finalise(firstProject);
				System.out.println("Enter 'b' to go back to main menu. ");
				String goback = sc.next();
				if (goback == "b") {
				}
			}
			
			// this option breaks the code and is used as quit function
			if (systemInput == 0) {
				break;
			}	
		}
	}
	
	// This function takes the project object as its argument and then allows the user to select which object argument it wants to be editing through setters in ProjectInfo class and displays them with getters
	private static void editProject(ProjectInfo project) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to change project number.");
		System.out.println("\nEnter 2 to change project name.");
		System.out.println("\nEnter 3 to change building type.");
		System.out.println("\nEnter 4 to change project address.");
		System.out.println("\nEnter 5 to change ERF number.");
		System.out.println("\nEnter 6 to change project fee.");
		System.out.println("\nEnter 7 to change paid to date.");
		System.out.println("\nEnter 8 to change deadline date.");
		
		int userIn = Integer.parseInt(sc.next());
		if (userIn == 1){
			
			System.out.println("Enter new project number: ");
	        int newProjectNumber = sc.nextInt();
	        project.setProjectNumber(newProjectNumber);
	        System.out.println("New number is " + project.getProjectNumber());
		}
		
		if (userIn == 2){
			
			System.out.println("Enter new project name: ");
	        String newProjectName = sc.nextLine();
	        project.setProjectName(newProjectName);
	        System.out.println("New name is " + project.getProjectName());
		}
		if (userIn == 3){
			
			System.out.println("Enter new building type: ");
	        String newBuildingType = sc.next();
	        project.setBuildingType(newBuildingType);
	        System.out.println("New building type is " + project.getBuildingType());
		}
		if (userIn == 4){
			
			System.out.println("Enter new physical Address: ");
	        String newProjectAddress = sc.nextLine();
	        project.setProjectAddress(newProjectAddress);
	        System.out.println("New project address is " + project.getProjectAddress());
		}
		if (userIn == 5){
			
			System.out.println("Enter new erf number: ");
	        int newErfNumber = sc.nextInt();
	        project.setERFNumber(newErfNumber);
	        System.out.println("New project erf number is " + project.getERFNumber());
		}
		if (userIn == 6){
			
			System.out.println("Enter new project fee: ");
	        int newProjectFee = sc.nextInt();
	        project.setProjectFee(newProjectFee);
	        System.out.println("New project fee is " + project.getProjectFee());
		}
		if (userIn == 7){
			
			System.out.println("Enter new project paid to date: ");
	        int newPaidToDate = sc.nextInt();
	        project.setPaidToDate(newPaidToDate);
	        System.out.println("New project paid to date is " + project.getPaidToDate());
		}
		if (userIn == 8){
			
			System.out.println("Enter new project deadline (dd/mm/yyyy): ");
	        String newDeadlineDate = sc.next();
	        project.setProjectDeadline(newDeadlineDate);
	        System.out.println("New project deadline is " + project.getProjectDeadline());
		}
	}

	// this function displays the menu options that are available for the user to engage with
	private static void menuOption() {
			System.out.println("This is Poised system operations for project information storage.");
			System.out.println("If you would like to add a project input 1.");
			System.out.println("If you would like to edit a project, input 2.");
			System.out.println("If you would like to view a project, input 3.");
			System.out.println("If you would like to access clients, input 4.");
			System.out.println("If you would like to access contractors, input 5.");
			System.out.println("If you would like to access architects, input 6.");	
			System.out.println("If you would like to finalise a project, input 7.");	
			
			System.out.println("Enter 0 to quit.");
		}
	
	// this function uses the ProjectInfo class to create a new project object through users input
	private static ProjectInfo createProject() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the project number: ");
		int projectNumber = sc.nextInt();
		
		System.out.println("Please enter the project name: ");
		String projectName = sc.next();
		
		System.out.println("Please enter the building type: ");
		String buildingType = sc.next();
		
		System.out.println("Enter the project address (Capitalised with no spaces inbetween): ");
		String projectAddress = sc.next();
		
		System.out.println("Enter the Erf number: ");
		int erfNumber = sc.nextInt();
		
		System.out.println("Enter the project fee: ");
		double projectFee = sc.nextDouble();
		
		System.out.println("Enter the amount paid to date: ");
		double paidToDate = sc.nextDouble();
		
		System.out.println("Enter the deadline date: ");
		String deadlineDate = sc.next();
		
		// this is the constructor from the ProjectInfo class that is taking all of the inputs and placing them into their appropriate variables
		ProjectInfo newProject = new ProjectInfo(projectNumber, projectName, buildingType, projectAddress, erfNumber, projectFee, paidToDate, deadlineDate);
		System.out.println("\nProject has been added.");
		
		return newProject;
	}
	
	// this function creates a new client object through inputs from the user
	private static clientDetails createClient() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Creating a new client.\nEnter the name: ");
		String name = sc.next();
		
		System.out.println("Enter the telephone number: ");
		String telephoneNumber = sc.next();
		
		System.out.println("Enter the email address: ");
		String emailAddress = sc.next();
		
		System.out.println("Enter the physcial Address of the client (capitalised with no spaces in between): ");
		String physicalAddress = sc.next();
		
		// this is the constructor from the clientDetails class that is taking all of the inputs and placing them into their appropriate variables
		clientDetails newClient = new clientDetails(name, telephoneNumber, emailAddress, physicalAddress);
		System.out.println("Client has been added.");
		
		return newClient;
	}
	
	// this function creates a contractor object through the users inputs
	private static contractorDetails createContractor() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Creating a new contractor.\nEnter the name: ");
		String name = sc.next();
		
		System.out.println("Enter the telephone number: ");
		String telephoneNumber = sc.next();
		
		System.out.println("Enter the email address: ");
		String emailAddress = sc.next();
		
		System.out.println("Enter the physcial Address of the contractor (capitalised with no spaces in between): ");
		String physicalAddress = sc.next();
		
		// this is the constructor from the contractorDetails class that is taking all of the inputs and placing them into their appropriate variables
		contractorDetails newContractor = new contractorDetails(name, telephoneNumber, emailAddress, physicalAddress);
		System.out.println("Customer has been added.");
		
		return newContractor;
	}
	
	// this function creates an architect object from the users inputs
	private static architectDetails createArchitect() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Creating a new contractor.\nEnter the name: ");
		String name = sc.next();
		
		System.out.println("Enter the telephone number: ");
		String telephoneNumber = sc.next();
		
		System.out.println("Enter the email address: ");
		String emailAddress = sc.next();
		
		System.out.println("Enter the physcial Address of the contractor (capitalised with no spaces in between): ");
		String physicalAddress = sc.next();
		
		// this is the constructor from the architectDetails class that is taking all of the inputs and placing them into their appropriate variables
		architectDetails newArchitect = new architectDetails(name, telephoneNumber, emailAddress, physicalAddress);
		System.out.println("Customer has been added.");
		
		return newArchitect;
	}

	// this is the finalise function in which a project is completed, and an invoice is produced as well as written to a file called "completed project"
	private static void finalise(ProjectInfo project) {
		Scanner sc = new Scanner(System.in);
		int fee = (int) project.getProjectFee();
		int paid = (int) project.getPaidToDate();
		int totalRemaining = (fee - paid);
		if (totalRemaining == 0) {
			System.out.println("This project is already paid off. \nEnter 'b' to go back to the main menu. ");
		}
		else {
			System.out.println("What is the completed date of the task (dd/mm/yyyy): ");
			String completedDate = sc.nextLine();
			
			String finalisedProject = project.toString() + "Completed date: " + completedDate + "\n\nThe Invoice for the project is as follows: \nProject fee: \t\t" + fee + "\nProject paid: \t\t" + paid + "\nTotal Outstanding: \t" + totalRemaining;
			System.out.println(finalisedProject + "\n");
		
			try {
				Formatter output = new Formatter("Completed Project.txt");
				output.format("%s", finalisedProject);
				output.close();    
				}
			catch (Exception e) {
				System.out.println("Error when writing to output file.");
			}
		}
	}
	
}
