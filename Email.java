import java.util.Scanner;
public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailCapacity = 500;
	private String altEmail;
	
	//Constructor to receive first and last name
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Call a method asking for the dept -- returns the dept
		this.department = setDept();
		
		//Call a method that returns a random password
		this.password = randPassword(10);
		System.out.println("Your password is: " +this.password);
	
	//Combine elements to generate email
		email = firstName.toLowerCase() +  "." + lastName.toLowerCase() +"@" + this.department.toLowerCase()+ ".baendit.com";
		System.out.println(email);
	}
	
	//Ask for department
	private String setDept() {
		System.out.print("Enter the department code: \n1 For Sales\n2 For Development\n3 For Accounting\n0 For None\nEnter Department Code:");
		Scanner sc = new Scanner(System.in);
		int deptChoice = sc.nextInt();
		if(deptChoice == 1) {
			return "Sales";
		}
		else if(deptChoice == 2) {
			return "Development";
		}
		else if(deptChoice == 3) {
			return "Accounting";
		}
		else
			return "general";
	}
	
	//Generate a random password
	private String randPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
	
		char[] arrPassword = new char[length];
		
		for(int i = 0; i < length-1; i++) {
			int rand = (int)(Math.random() * (passwordSet.length()-1) + 1);
			arrPassword[i] = passwordSet.charAt(rand);
		}
		return new String(arrPassword);
	}
	
	//Set the mailbox capacity
	public void setMailBoxCapacity(int emailCapacity) {
		this.mailCapacity = emailCapacity;
	}
	
	//Set the alt-Email
	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String passWord) {
		this.password = password;
	}
	
	//Get method to display name
	public String getName() {
		return firstName + " " + lastName;
	}
	
	//Get method for email
	public String getEmail() {
		return email;
	}
	//Get method for mailboxCapacity
	public int getMailboxCapacity() {
		return mailCapacity;
	}
	
	public String showInfo() {
		return "Employee Name: "+getName()+
		"\nCompany Email: " +getEmail()+
		"\nMailbox Capacity: "+String.valueOf(mailCapacity) + "mb";
	}
}
