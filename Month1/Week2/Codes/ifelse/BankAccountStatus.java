import java.util.*;
class BankAccountStatus 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the balance amount :");
		int b = sc.nextInt();
		
		System.out.println("Give the Minimum balance amount :");
		int mb = sc.nextInt();
		
		boolean statusFlagged = false;
		
		if(statusFlagged == true){
			System.out.println("Flagged");
		}else if(b<mb){
			System.out.println("Low balance");
		}else if(b>=mb){
			System.out.println("Active");
		}
	}
}
