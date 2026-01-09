
package Opps;
import java.util.*;
public class LoginUsingInheritance {
	public static void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your user name you want to create :");
		String username = sc.nextLine();
		System.out.println("Enter your Password you want to create :");
		String userpassword = sc.nextLine();
		Google g1 = new Google(username,userpassword);
		
		
	}

}

class Google{
	private String username;
	private String userpassword;
	Google(String username, String userpassword){
		this.username = username;
		this.userpassword = userpassword;
	}
	public String getName() {
		return username;
	}
	
}
class Maps extends Google{
	
}
class Drive extends Google{
	
}
class Photos extends Google{
	
}