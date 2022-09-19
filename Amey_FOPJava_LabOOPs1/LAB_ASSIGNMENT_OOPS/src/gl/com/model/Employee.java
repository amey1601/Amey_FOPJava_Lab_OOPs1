package gl.com.model;



public class Employee {
	private String firstName;
	private String lastName;
	
	
	public String getFirstname() {
		return firstName;
	}
	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastName) {
		this.lastName = lastName;
	}
	
	public Employee(String fname, String lname) {
		super();
		firstName = fname;
		lastName=lname;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
	
