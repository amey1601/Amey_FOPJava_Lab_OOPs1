package gl.com.test;
import gl.com.model.Employee;
import gl.com.services.*;
import java.util.Scanner; 


public class Testing {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter your first name:");
		String fname= sc.nextLine();
		System.out.println("enter your last name:");
		
		String lname= sc.nextLine();
		
		Employee e= new Employee(fname,lname);
		CredentialService cs = new CredentialServiceimpl();
		String generatedEmail;
		String generatedPassword;
		
		System.out.println("Please enetr the department from the following;");
		System.out.println("1. TECHNICAL");
		System.out.println("2. ADMIN");
		System.out.println("3. HUMAN RESOURCE");
		System.out.println("4. LEGAL");
		int option = sc.nextInt();
		
		String dept="general";
		switch(option) {
		case 1: 
			dept="tech";
			break;
		case 2:
			dept="adm";
			break;
		case 3:
			dept="hr";
			break;
			
		case 4:
			dept="lg";
			break;
			
		default:
			System.out.println("Please enter a valid option.");
			break;}
			
		generatedEmail= cs.generateEmail(e.getFirstname(), e.getLastname(), dept);
		
		generatedPassword=cs.generatepassword1();
		 
		cs.showCred(e, generatedEmail, generatedPassword);
		
		
	
		sc.close();
		
		
			

	}

}
