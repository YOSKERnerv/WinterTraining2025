import java.util.*;
class  EmployeeWorkArea
{
	public static void main(String[] args) 
	{
		
		//Enter age, Gender (M or F) and then using following rules print their place of service
		//if employee is female, then she will work only in urban areas.
		//if employee is male and age is in between 40 to 60 then he will work only in urban areas
		//if employee is a male and age is is in in between 20 to 40 then he may work in anywhere
		// And any other input of age should print "ERROR".
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the employee: ");
		int age = sc.nextInt();
		System.out.println("Enter the gender of the employee:/n 1. Male/n 2. Female ");
		int gender = sc.nextInt();
		
		if(gender==1){
			if(age>=40 && age<=60){
				System.out.println("You will work in Urban Area Only ");
			}else if(age>=20 && age<40){
				System.out.println("You may work anywhere of your choice ");
			}else{
				System.out.println("ERROR");
			}
		}else if(gender ==2){
			System.out.println("You will work in Urban Area Only");
		}else{
			System.out.println("Please enter correct gender");
		}
		
	}
}
