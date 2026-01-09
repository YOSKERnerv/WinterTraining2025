package Opps;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username :");
		String name = sc.nextLine();
		System.out.println("Enter your password:");
		String password = sc.nextLine();
		System.out.println("Enter your phonenumber:");
		long phonenumber = sc.nextLong();
		// TODO Auto-generated method stub
		Register r = new Register(name,password,phonenumber);
		
		
		Ola o =  new Mini("Yosker",77777,5464,4,"lpu",500);
		o.login();
		

	}

}
class Register{
	private String username;
	private String password;
	private long phonenumber;
	Register(String username,String password,long phonenumber){
		this.username  = username;
		this.password = password;
		this.phonenumber = phonenumber;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public long getPhoneNumber() {
		return phonenumber;
	}
}

class Ola{
	private String username;
	private long contactNumber;
	private double uberAccBalance;
	private Register register;
	Ola(String username,long contactNumber,double uberAccBalance, Register register){
		this.username = username;
		this.contactNumber = contactNumber;
		this.uberAccBalance = uberAccBalance;
		this.register = register;
	}
	
	public boolean login(){
		if(username.equals(register.getUsername()) && contactNumber==register.getPhoneNumber()) {
			return true;
		}
		return false;
	}
}




