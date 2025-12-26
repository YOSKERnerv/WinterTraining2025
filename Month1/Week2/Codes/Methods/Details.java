import java.util.*;
class Details 
{
	public static void main(String[] args) 
	{
		System.out.println(details2());
		
		
		System.out.println("\n Method 2 is \n");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		sc.nextLine();	
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter your weight :");
		double weight = sc.nextDouble();
		details(age,name,weight);
		
	}
	public static String details2(){
		int age = 34;
		String name = "Sagar";
		double weight = 74.2;
		
		return (" age :"+age+"\n name :"+name+"\n weight :"+weight); 
	}
	
	public static void details(int age,String name,double weight){
		
		
		System.out.println("age :"+age);
		System.out.println("name :"+name);
		System.out.println("Weight :"+weight);
	}	
}
