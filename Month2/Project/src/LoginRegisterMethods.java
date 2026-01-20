import java.util.HashMap;
import java.util.Scanner;
public class LoginRegisterMethods {
//	private String username;
//	private String userID;
//	private String userRank;
//	private String userPassword;
//	private String presidentID;
//	private String presidentPassCode;
	HashMap<String,String> personnelCredientials = new HashMap<>();
	HashMap<String,String> presedentCredientials= new HashMap<>();
	
	static Scanner sc = new Scanner(System.in);
	
	
//	*********************   CONSTRUCTOR  *****************************************
//	LoginRegisterMethods(String username,String userID,String userRank,String userPassword){
//		this.username = username;
//		this.userID = userID;
//		this.userRank = userRank;
//		this.userPassword = userPassword;
//	}
//	LoginRegisterMethods(String presidentID,String presidentPassCode){
//		this.presidentID = presidentID;
//		this.presidentPassCode = presidentPassCode;
//	}
//	*********************   CONSTRUTOR END*****************************************
	
	
//	*********************   REGISTERATION METHOD  *****************************************
	public boolean registerPersonnel(String userID,String userPassword){
		System.out.println("loginregisterMethod-- registerPersonnel");
		
		if(personnelCredientials.containsKey(userID)) {
			return false;
		}
			personnelCredientials.put(userID,userPassword);
			System.out.println("User Registered");
			return true;
	}
	//                    president register.
	
	public void createPresident(DataBase db) {

	    if (presedentCredientials.size() != 0) {
	        System.out.println("President already exists!");
	        return;
	    }

	    System.out.println("Country has just gotten freedom!!!");
	    System.out.println("-------Elect the President-------");

	    System.out.println("Enter the President Name : ");
	    String presidentName = sc.nextLine();

	    System.out.println("Enter the President ID: ");
	    String presidentID = sc.nextLine();

	    System.out.println("Enter the Salary Of the President:");
	    double presidentSalary = sc.nextDouble();
	    sc.nextLine();

	    System.out.println("Rank of President is : President");

	    System.out.println("Enter the President Military Pass Code:");
	    String presidentCode = sc.nextLine();

	    // Store credentials (ONLY here)
	    registerPresident(presidentID, presidentCode);

	    // President domain object
	    PresidentClass president = new PresidentClass(presidentID, presidentName, presidentSalary);

	    boolean added = db.addPresident(president);

	    if (added && presedentCredientials.size() == 1) {
	        System.out.println("President has been successfully registered in the database!");
	    } else {
	        System.out.println("Failed to register President!");
	    }
	}

	
	
	public void registerPresident(String presidentID,String presidentPassCode){
		
			presedentCredientials.put(presidentID, presidentPassCode);
			System.out.println(presedentCredientials);
			System.out.println("New President Registered in Super Secure DataBase!! \n\n");
			System.out.println("***************************************************");
	}
	
	
	
//	*********************   REGISTERATION METHOD END*****************************************
	
	
	
//  **********************  LOGIN METHOD START       ************************************	
	public boolean Login(String rank) {
		
//		System.out.println("Your Military ID");
//		String b = sc.nextLine();
//		System.out.println("\n\n\n checking the data file\n\n\n");
//		System.out.println(presedentCredientials);
//		System.out.println(b);
//		if(personnelCredientials.containsKey(b) || (presedentCredientials.containsKey(b) && rank.equals("President")) ) {
//			int i=3;
//			System.out.println("\n\n\n checking the true value for contains key\n\n\n");
//			System.out.println(presedentCredientials.containsKey(b));
//			while(i>0) {
//				System.out.println("Your password");
//				String c = sc.nextLine();
//				System.out.println("\n\n\n"+personnelCredientials.containsValue(c));
//				if(personnelCredientials.containsValue(c)) {
//					return true;
//				}else {
//					System.out.println("Invalid Password,  Try Again!!!");
//					System.out.println(i+"Chances Remaining");
//				}
//				i--;
//				System.out.println(i+"Chances Remaining");
//			}
//			
//		}else {
//			System.out.println("Wrong MilitaryID");
//		}
//		
//		return false;
		
		
		
		
		System.out.println("Your Military ID");
	    String id = sc.nextLine();

	    if (personnelCredientials.containsKey(id) ||
	        (presedentCredientials.containsKey(id) && rank.equals("President"))) {

	        int attempts = 3;

	        while (attempts > 0) {
	            System.out.println("Your password");
	            String password = sc.nextLine();

	            if (personnelCredientials.containsKey(id)) {
	                if (personnelCredientials.get(id).equals(password)) {
	                    return true;
	                }
	            }

	            if (presedentCredientials.containsKey(id)) {
	                if (presedentCredientials.get(id).equals(password)) {
	                    return true;
	                }
	            }

	            attempts--;
	            System.out.println("Invalid Password. Attempts left: " + attempts);
	        }

	    } else {
	        System.out.println("Wrong Military ID");
	    }

	    return false;
	}
	
	
	
	

//	*********************   UPDATION METHOD *****************************************
	
	//             officer updation
	public void updateNewPersonnel(String userID,String userNewPassword,boolean permissionGranted) {
		if(personnelCredientials.containsKey(userID)) {
			personnelCredientials.put(userID, userNewPassword);
			System.out.println("Your password has been updated");
		}else {
			System.out.println("User ID NOT FOUND .");
		}
	}
	
	 //                      President updation
	public void updateNewPresident(String presidentID, String newPresidentPassCode) {
		PresidentClass presi1 = new PresidentClass();
		presidentID = presi1.getPresidentID();
		System.out.println("Enter the New PASS CODE : ");
		newPresidentPassCode = sc.nextLine();
		if(presedentCredientials.containsKey(presidentID)) {
			presedentCredientials.put(presidentID, newPresidentPassCode);
		}
		System.out.println("New President Elected and Saved");
	}
//	*********************  PRESIDENT REGISTERATION METHOD END*****************************************
	
	

//	*********************   DISPLAY METHOD *****************************************
	// remove this..
//	public void displayPersonnelData(){
////		personnelCredientials.getNode(userID);
//		System.out.println(personnelCredientials);
//	}
//	public void displayPresidentData() {
//		System.out.println(presedentCredientials);
//		}
//	*********************   DISPLAY METHOD END*****************************************
	
	
	//*****************************     General Methods    *******************************
	
	
	public void appointGeneral(DataBase db) {
		System.out.println("Enter the General Name : ");
	    String name = sc.nextLine();
	    System.out.println("Enter the General ID: ");
	    String id = sc.nextLine();

	    if (personnelCredientials.containsKey(id)) {
	        System.out.println("General already exists!");
	        return;
	    }

	    System.out.println("Enter the Salary Of the General.");
	    double salary = sc.nextDouble();
	    sc.nextLine();
	    System.out.println("Enter the General Military Pass Code");
	    String generalPassCode = sc.nextLine();

	    personnelCredientials.put(id, generalPassCode);

	    General general = new General(id, name, salary);
	    boolean added = db.addPersonnel(general);

	    if (added) {
	        System.out.println("General appointed successfully");
	    } else {
	        System.out.println("General already exists in database");
	    }
		
		
	}
	
	
	
	
	
}