import java.util.*;
class LoanEligibility 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Welcome to loanCheck!!");
		do {
            user();
        } while (again());

        System.out.println("Thank you for applying!");
		
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
			System.out.println("Enter the total loan u already have ");
			double tloan = sc.nextDouble();
			
			//now checking the eligibility.....
			String status = check(income,score,loan,tloan);
			System.out.println("Your status is : "+status);
			
			
			
		}
	}
	static boolean again() {
        System.out.print("\nContinue? (1 = Yes, 2 = No): ");
        return sc.nextInt() == 1;
    }
	public static String check(double income,double score,double loan,double tloan){
		String eli =  "Eligible\n\n";
		double c = income/12;
		double d = loan / 12;
		if(tloan>5 ||(c/3)>d || score<100){
			eli = "Not Eligible ";
		}
		
		return eli;
	}
}
