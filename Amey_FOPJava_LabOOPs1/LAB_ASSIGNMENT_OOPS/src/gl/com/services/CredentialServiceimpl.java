package gl.com.services;
import java.util.Random;

import gl.com.model.Employee;

public class CredentialServiceimpl implements CredentialService{

	
	

	@Override
	public String generatepassword1() {
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String low="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String special="!@#$%^&*()_+?/";
		
		String val= caps+ low+ numbers+ special;
		
		Random rand= new Random();
		char[] pass1= new char[3];
		char[] pass2=new char[3];
		char[] pass3=new char[1];
		char[] pass4=new char[1];
		
		
		for (int i=0; i<3 ;i++) {
			pass1[i]=caps.charAt(rand.nextInt(caps.length()));
		}
		
		for (int i=0; i<3 ;i++) {
			pass2[i]=low.charAt(rand.nextInt(low.length()));
		}
		for (int i=0; i<1 ;i++) {
			pass3[i]=special.charAt(rand.nextInt(special.length()));
		}
		for (int i=0; i<1 ;i++) {
			pass4[i]=numbers.charAt(rand.nextInt(numbers.length()));
		}
		String s = new StringBuilder().append(pass1).append(pass2).append(pass3).append(pass4).toString();
		return s;
		
		
	}

	@Override
	public String generateEmail(String fname,String lname, String dept) {
		String email= fname+lname+"@"+dept+".greatlearning.com";		
		return email;}

	@Override
	public void showCred(Employee e, String email, String generatedPassword) {
		System.out.println("Dear"+" "+ e.getFirstname()+" "+"your generated credentials are as follows:");
		System.out.println("Email:"+ " "+email);
		System.out.println("password:"+ " "+generatedPassword.toString());
		
		
	}

}
