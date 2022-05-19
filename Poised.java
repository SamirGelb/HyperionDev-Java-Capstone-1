package poisedCapstone;
import java.util.*;

public class Poised {

	public static void main(String[] args) {
		
		//Creating a scanner object
		Scanner input = new Scanner(System.in);
		
		// Declaring variables for each person's details
		String personType = null;
					
		String architectName = null;
		String architectSurname = null;
		String architectPhoneNumber = null;
		String architectEmail = null;
		String architectAddress = null;
					
		String contractorName;
		String contractorSurname;
		String contractorPhoneNumber;
		String contractorEmail;
		String contractorAddress;
					
		String customerName = null;
		String customerSurname = null;
		String customerPhoneNumber = null;
		String customerEmail = null;
		String customerAddress = null;
					
		// Declaring variables for project information
		String projectName = null;
		String buildingAddress = null;
		String buildingType = null;
		String projectDeadline = null;
		boolean projectCompletion = false;
		String newProjectDeadline;
		String completionDate;
		personalInformation architect1;
		personalInformation contractor1;
		personalInformation customer1;
		int customerFee = 0;
		int amountPaidToDate = 0;
		int erf = 0;
		int projectNumber = 0;
		int newAmountPaid = 0;
		int outstandingAmount;

		System.out.println("You have chosen to add a new project.");
		
		//Gathering the project information
		System.out.println("\nPlease enter the name of the project: ");
		input = new Scanner(System.in);
		projectName = input.nextLine();
		
		System.out.println("\nPlease enter the address of this building: ");
		input = new Scanner(System.in);
		buildingAddress = input.nextLine();
		
		System.out.println("\nPlease enter the type of building for this project: ");
		input = new Scanner(System.in);
		buildingType = input.nextLine();
		
		System.out.println("\nPlease enter the surname of the customer for whom this project is being built: ");
		input = new Scanner(System.in);
		customerSurname = input.nextLine();
		
		//Adding code for if the user fails to enter a project name.
		if(projectName.equals("")) {
			projectName = buildingType + " " + customerSurname;
		}
		
		System.out.println("\nPlease enter the project's due date: ");
		input = new Scanner(System.in);
		projectDeadline = input.nextLine();
		
		System.out.println("\nPlease enter the cost of this project: R");
		input = new Scanner(System.in);
		customerFee = input.nextInt();
		
		System.out.println("\nPlease enter the amount paid by the customer to date: R");
		input = new Scanner(System.in);
		amountPaidToDate = input.nextInt();
		
		System.out.println("\nPlease enter the project's ERF number: ");
		input = new Scanner(System.in);
		erf = input.nextInt();
		
		System.out.println("\nPlease enter the project number: ");
		input = new Scanner(System.in);
		projectNumber = input.nextInt();
		
		/* by default a new project is incomplete 
		 * so this block of code is if a user wishes to add a previously completed project
		 * */
		if(projectCompletion == true) {
			System.out.println("\nPlease enter the date of completion: ");
			completionDate = input.nextLine();
		}
		
		else {
			completionDate = null;
		}
		
		
		// Gathering the customer's information
		System.out.println("\nPlease enter the customer's details");
		
		// Creating a customer object of the personalInformation class.
		personalInformation customer = new personalInformation(personType, customerName, customerSurname, customerPhoneNumber, customerEmail, customerAddress);
		personType = "Customer";
		
		// Asking the user for the customer's information
		System.out.println("\nCustomer's first name: ");
		input = new Scanner(System.in);
		customerName = input.nextLine();
		customer.setName(customerName);
			
		System.out.println("\nCustomer's surname: ");
		input = new Scanner(System.in);
		customerSurname = input.nextLine();
		customer.setSurname(customerSurname);
				
		System.out.println("\nCustomer's phone number: ");
		input = new Scanner(System.in);
		customerPhoneNumber = input.nextLine();
		customer.setPhoneNumber(customerPhoneNumber);
				
		System.out.println("\nCustomer's email address: ");
		input = new Scanner(System.in);
		customerEmail = input.nextLine();
		customer.setEmail(completionDate);
				
		System.out.println("\nCustomer's Address: ");
		input = new Scanner(System.in);
		customerAddress = input.nextLine();
		customer.setAddress(customerAddress);
		
		
		//Gathering the architect's information.
		System.out.println("\nPlease enter the Architect's details");
		
		// Creating an architect object of the personalInformation class.
		personalInformation architect = new personalInformation(personType, architectName, architectSurname, architectPhoneNumber, architectEmail, architectAddress);
		personType = "Architect";
		
		// Asking the user for the architect's information
		System.out.println("Architect's first name: ");
		input = new Scanner(System.in);
		architectName = input.nextLine();
		architect.setName(architectName);
	
		System.out.println("\nArchitect's surname: ");
		input = new Scanner(System.in);
		architectSurname = input.nextLine();
		architect.setSurname(architectSurname);
		
		System.out.println("\nArchitect's phone number: ");
		input = new Scanner(System.in);
		architectPhoneNumber = input.nextLine();
		architect.setPhoneNumber(architectPhoneNumber);
		
		System.out.println("\nArchitect's email address: ");
		input = new Scanner(System.in);
		architectEmail = input.nextLine();
		architect.setEmail(architectEmail);
		
		System.out.println("\nArchitect's Address: ");
		input = new Scanner(System.in);
		architectAddress = input.nextLine();
		architect.setAddress(architectAddress);
		
		
		//Gathering the contractor's information.
		System.out.println("\nPlease enter the Contractor's details");
		
		// Creating a contractor object of the personalInformation class.
		personalInformation contractor = new personalInformation(personType, architectName, architectSurname, architectPhoneNumber, architectEmail, architectAddress);
		personType = "Contractor";
		
		// Asking the user for the contractor's information
		System.out.println("Contractor's first name: ");
		input = new Scanner(System.in);
		contractorName = input.nextLine();
		contractor.setName(contractorName);
			
		System.out.println("\nContractor's surname: ");
		input = new Scanner(System.in);
		contractorSurname = input.nextLine();
		contractor.setSurname(contractorSurname);
				
		System.out.println("\nContractor's phone number: ");
		input = new Scanner(System.in);
		contractorPhoneNumber = input.nextLine();
		contractor.setPhoneNumber(contractorPhoneNumber);
				
		System.out.println("\nContractor's email address: ");
		input = new Scanner(System.in);
		contractorEmail = input.nextLine();
		contractor.setEmail(contractorEmail);
			
		System.out.println("\nContractor's Address: ");
		input = new Scanner(System.in);
		contractorAddress = input.nextLine();
		contractor.setAddress(contractorAddress);
		
		
		// Creating an object of the projectInfo class
		projectInfo project = new projectInfo(projectName, buildingAddress, buildingType, projectDeadline, projectCompletion, completionDate, contractor, architect, customer, customerFee, amountPaidToDate, erf, projectNumber);
		
		
		// Printing out the project details
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		System.out.println("Project details: ");
		System.out.println(project.toString());
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// Using a while loop to enter the menu
		while(true) {
			
			// Presenting the user with a menu
			System.out.println("\nPlease select one of the following options: " 
				+ "\n1 - Change a project's deadline."
				+ "\n2 - Change the amount paid by the customer."
				+ "\n3 - Update the contractor's details."
				+ "\n4 - Finalise a project."
				+ "\n5 - Return to original menu.");
			
			int menuOption = input.nextInt();
			
			// Using if statements for each user choice
			if(menuOption == 1) {
				
				System.out.println("\nYou have chosen to edit a project's deadline.");
				
				// Using getters and setters to change the project deadline
				System.out.println("\nPlease enter a new deadline: ");
				input = new Scanner(System.in);
				newProjectDeadline = input.nextLine();
				project.getProjectDeadline();
				project.setProjectDeadline(newProjectDeadline);
			}
				
			if(menuOption == 2) {
				System.out.println("\nYou have chosen to edit the amount paid by the customer.");
				
				//Using getters and setters to change the amount paid by the customer
				System.out.println("\nPlease enter the amount paid by the customer: R");
				input = new Scanner(System.in);					
				newAmountPaid = input.nextInt();
				project.getAmountPaid();
				project.setAmountPaidToDate(newAmountPaid);
				
				System.out.println("Amount paid has been updated.");
				
				if(customerFee == newAmountPaid) {
					
					// Printing a message for if the customer has paid in full
					System.out.println("\nCustomer has paid in full.");
					project.getAmountPaid();
					project.setAmountPaidToDate(customerFee);
				}
			}
				
			if(menuOption == 3) {
					
				System.out.println("\nYou have chosen to update a contractor's details");
				
				// Using setters to update the contractor's details
				System.out.println("Contractor's first name: ");
				input = new Scanner(System.in);
				contractorName = input.nextLine();
				contractor.setName(contractorName);
					
				System.out.println("\nContractor's surname: ");
				input = new Scanner(System.in);
				contractorSurname = input.nextLine();
				contractor.setSurname(contractorSurname);
						
				System.out.println("\nContractor's phone number: ");
				input = new Scanner(System.in);
				contractorPhoneNumber = input.nextLine();
				contractor.setPhoneNumber(contractorPhoneNumber);
						
				System.out.println("\nContractor's email address: ");
				input = new Scanner(System.in);
				contractorEmail = input.nextLine();
				contractor.setEmail(contractorEmail);
					
				System.out.println("\nContractor's Address: ");
				input = new Scanner(System.in);
				contractorAddress = input.nextLine();
				contractor.setAddress(contractorAddress);
				
				System.out.println("Contractor Details updated.");
				System.out.println(contractor);
				
			}
			
			if(menuOption == 4) {
				
				System.out.println("\nYou have chosen to finalise a project and print an invoice for the customer.");
				
				//calculating the outstanding amount owed by the customer
				outstandingAmount = customerFee - amountPaidToDate;
				
				// Marking the project as complete and adding the completion date
				projectCompletion = true;
				System.out.println("\nPlease enter the date of completion: ");
				completionDate = input.nextLine();
				
				// Printing out a customer invoice
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				System.out.println("Project details: ");
				System.out.println("Customer: " + customer.toString() + "\n"
						+ project.toString() 
						+ "\nAMOUNT OUTSTANDING: R" + outstandingAmount);
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			}
		
			if(menuOption == 5) {
					
				// If the user chooses to exit the program an exit message is printed and the program exits
				System.out.println("Arrivederci!");
				break;
			}
			
			}
		}
	}