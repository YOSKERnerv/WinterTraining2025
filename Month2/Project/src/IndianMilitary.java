import java.util.Scanner;
public class IndianMilitary{
	static Scanner sc =  new Scanner(System.in);
	static LoginRegisterMethods personnelData = new LoginRegisterMethods();
	static DataBase db = new DataBase();
	static PresidentClass president = new PresidentClass();
	public static void main(String args[]) {
		System.out.println("******    Welcome to the Main Page of Army Management System!!      *********** ");
		db.displayAll();
		
		
		personnelData.createPresident(db);
		
		
		int rankOption  = displayRankOption();
		
		switch(rankOption) {
		case 1: 
//			personnelData.displayPresidentData();
			presidentDisplay();
			break;
		case 2:
			generalDisplay();
			break;
		case 3:
			perdonnelDisplay();
			break;
		}
		
		
		
	}
	
	
//    **************************************  Display Option RUN FIRST  *******************************************
	
	public static int displayRankOption() {
		
		System.out.println("Please Select your RANK");
		System.out.println("Your rank : ");
		System.out.println("Select :\n 1) President\n 2) General\n 3) Soldier");
		int a = sc.nextInt();
		if(a==1) {
			if(personnelData.Login("President")) {
				System.out.println("You have Sucessfully LogedIn");
			}else {
				System.out.println("You Failed !!! UnAuthorised Access!!!");
			}
			
		}else if(a==2) {
			if(personnelData.Login("General")) {
				System.out.println("You have Sucessfully LogedIn");
			}else {
				System.out.println("You Failed !!! UnAuthorised Access!!!");
			}
		}else if(a==3) {
			if(personnelData.Login("Soilder")) {
				System.out.println("You have Sucessfully LogedIn");
			}else {
				System.out.println("You Failed !!! UnAuthorised Access!!!");
			}
		}else {
			System.out.println("Please select a valid value .");
		}
		return a;
	}
	
	
// ******************************* PRESEDENT DISPLAY      ****************************
	public static void presidentDisplay(){
		System.out.println("Welcome to President display.. Work in Progress");
		System.out.println(" 1) Appoint a General .");
		System.out.println(" 2) Display all personnel .");
		System.out.println(" 3) Update Neuclear Codes .");
		System.out.println(" 4) Give command to all ARMY .");
		System.out.println(" 5) Elect New President .");
		int a = sc.nextInt();
		switch(a) {
		case 1:
			personnelData.appointGeneral(db);
			System.out.println("General Has been appointed");
			break;
		case 2:
			db.displayAll();
			break;
		case 3:
			personnelData.updateNewPresident("","");
			System.out.println("NeuclearCode has Been Updated!!");
			break;
		case 4:
			president.giveCommandToArmy();
			System.out.println("Command Given to All Army!!");
			break;
		case 5:
			break;
		default:
			System.out.println("Select Correc Rank!!");
			
		}
		
		db.displayAll();
		
		
		
	}
	
//    *********************  General Display  ************************
	
	public static void generalDisplay() {
		
	}
	
	
	public static void perdonnelDisplay(){
		
		System.out.println("Please Select the option You want to select");
		System.out.println("Select :");
		System.out.println("1) Update PassWord");
		System.out.println("2) See Salary");
		System.out.println("3) Apply for Leave");
		System.out.println("4) Apply for Promotion");
		System.out.println("5) See Score");
		System.out.println("6) Do you want to continue? Y/N");
		

		
		int a = sc.nextInt();
		System.out.print(a);
	}

}
