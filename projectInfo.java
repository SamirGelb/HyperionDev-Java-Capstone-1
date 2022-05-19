package poisedCapstone;

public class projectInfo {
	
	// Declaring attributes
	String projectName;
	String buildingAddress;
	String buildingType;
	String projectDeadline;
	boolean projectCompletion;
	String completionDate;
	personalInformation contractor;
	personalInformation architect;
	personalInformation customer;
	int customerFee;
	int amountPaidToDate;
	int erf;
	int projectNumber;
	
	// Methods
	public projectInfo(String projectName, String buildingAddress, String buildingType, String projectDeadline, boolean projectCompletion, String completionDate, personalInformation contractor, personalInformation architect, personalInformation customer, int customerFee, int amountPaidToDate, int erf, int projectNumber) {
		
		this.projectName = projectName;
		this.buildingAddress = buildingAddress;
		this.buildingType = buildingType;
		this.projectDeadline = projectDeadline;
		this.projectCompletion = projectCompletion;
		this.completionDate = completionDate;
		this.contractor = contractor;
		this.architect = architect;
		this.customer = customer;
		this.customerFee = customerFee;
		this.amountPaidToDate = amountPaidToDate;
		this.erf = erf;
		this.projectNumber = projectNumber;
		
	}
	
	// Creating getters for the project information
	public String getProjectDeadline() {
		return this.projectDeadline;
	}
	public int getAmountPaid() {
		return this.amountPaidToDate;
	}
	
	public personalInformation getContractor() {
		return this.contractor;
	}
	
	public personalInformation getArchitect() {
		return this.architect;
	}
	
	public personalInformation getCustomer() {
		return this.customer;
	}
	
	// Creating setters for the project information
	public void setProjectDeadline(String newProjectDeadline) {
		projectDeadline = newProjectDeadline;
	}
	
	public void setAmountPaidToDate(int newAmountPaid) {
		amountPaidToDate = newAmountPaid;
	}
	
	public void setProjectCompletion(boolean projectComplete) {
		projectCompletion = projectComplete;
	}
	
	// Creating a toString of the ProjectDetails
	public String toString() {
		
		String output = "Project Name: " + projectName;
		output += "\nBuilding Address: " + buildingAddress;
		output += "\nBuilding Type: " + buildingType;
		output += "\nCustomer Name: " + customer.getName() + " " + customer.getSurname();
		output += "\nProject Deadline: " + projectDeadline;
		output += "\nProject Cost: R" + customerFee;
		output += "\nAmount Paid To Date: R" + amountPaidToDate;
		output += "\nERF Number: " + erf;
		output += "\nProjectNumber: " + projectNumber;
		output += "\nProjectComplete?: " + projectCompletion;
		output += "\nCompletion Date: " + completionDate;
		output += "\nArchitect: " + architect.getName() + " " + architect.getSurname();
		output += "\nContractor: " + contractor.getName() + " " + contractor.getSurname();
		
		return output;
	}
}
