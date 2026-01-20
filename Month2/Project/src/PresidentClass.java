import java.util.*;
public class PresidentClass extends IndianArmy{
	Scanner sc = new Scanner(System.in);
	
	PresidentClass(String presidentName, String presidentPassCode, String presidentID) {
		super(presidentName, presidentPassCode,presidentID);
		
	}
	public PresidentClass(){
		
	}
	public PresidentClass(String presidentID, String presidentName,double salary) {
		this.presidentID = presidentID;
		this.presidentName = presidentName;
		this.salary = salary;
	}
	
	LoginRegisterMethods loginRegister = new LoginRegisterMethods();
	
	
	@Override
	public void registerPresident(String presidentID, String presidentPassCode) {
		
	}

	@Override
	public void updateNewPresident(String presidentID, String newPresidentPassCode) {
		
		loginRegister.updateNewPresident(presidentID, newPresidentPassCode);
	}
	
	public boolean electNewPresident() {
		
		
		return false;
	}
	
	public String getPresidentID() {
		return presidentID;
	}
	
	
	
	String message;
	public String giveCommandToArmy() {
		String message = "";
		if(message.length()==0) {
			message = sc.nextLine();
		}
		String command = message;
		return command;
	}
	
	

}
