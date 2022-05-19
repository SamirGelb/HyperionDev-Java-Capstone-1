package poisedCapstone;

public class personalInformation {
		
	/* Declaring attributes. 
	 * I made the phone number a string in order to make it easier to write to a file (eg excel) in future. */
	String personType;
	String name;
	String surname;
	String phoneNumber;
	String emailAddress;
	String physicalAddress;
		
	// Methods
	public personalInformation(String personType, String name, String surname, String phoneNumber, String emailAddress, String physicalAddress) {
		
		this.personType = personType;
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
	}
	
	// creating getters for personal details
	public String getPerson() {
		return this.personType;
	}
	
	public String getName() {
		return this.name;
	}
		
	public String getSurname() {
		return this.surname;
	}
		
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
		
	public String getEmailAddress() {
		return this.emailAddress;
	}
		
	public String getPhysicalAddress() {
		return this.physicalAddress;
	}
	
	// creating setters for personal details 
	public void setPerson(String personType) {
		this.personType = personType;
	}
		
	public void setName(String name) {			
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setEmail(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}
	
	// Creating a toString of the personal information
	public String toString() {	
		String output = "Project Role: " + personType;
		output += "\nName: " + name;
		output += "\nSurname: " + surname;
		output += "\nPhone Number: " + phoneNumber;
		output += "\nEmail Address: " + emailAddress;
		output += "\nPhysical Address: " + physicalAddress;
			
		return output;
	}

}
