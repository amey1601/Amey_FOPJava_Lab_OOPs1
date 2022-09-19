package gl.com.services;
import java.util.Scanner;
import gl.com.model.Employee;
import java.util.Random;




public interface CredentialService {
	
	public String generatepassword1();
	public String generateEmail(String fname,String lname, String dept);
	public void showCred(Employee e, String email, String password);
		
	
	
}