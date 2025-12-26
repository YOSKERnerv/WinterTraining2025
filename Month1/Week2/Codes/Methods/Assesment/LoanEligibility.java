import java.util.*;
class LoanEligibility 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Welcome to loanCheck!!");
		user();
		again();
		
		
	}
	public static void user(){
		System.out.println("Enter the number of user you want to check");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++){
			System.out.println("Enter the monthly Income of User"+i);
			double income  = sc.nextDouble();
			System.out.println("Enter the Credit Score of User"+i);
			double score = sc.nextDouble();
			System.out.println("Enter the Loan Amount of User"+i);
			double loan = sc.nextDouble();
			
			//now checking the eligibility.....
			String status = check(income,score,loan);
			System.out.println("Your status is : "+status);
			
			
			
		}
	}
	public static void again(){
		System.out.println("Do you want to Conitnue :\n 1. Yes \n 2. No");
			int want = sc.nextInt();
			if(want==1){
				user();
			}else{
					System.out.println("Thank You for Appling");
			}
	}
	public static String check(double income,double score,double loan){
		System.out.println("Enter the total loan u already have ");
		double a = sc.nextDouble();
		
		String eli =  "Eligible\n\n";
		double c = income/12;
		double d = loan / 12;
		if(a>5 ||(c/3)>d || score<100){
			eli = "Not Eligible ";
		}
		
		return eli;
	}
}
