import java.util.*;
class A15 
{
	public static void main(String[] args) 
	{
		//COunt the number between M and N except the number which has 5 in it
		int count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of M : ");
		int m = sc.nextInt();
		System.out.println("Enter the value of N : ");
		int n = sc.nextInt();
		for(int i=m ;i<=n;i++){
			int temp = i;
			int a = 0;
			boolean c = false;
			while(temp!=0){
				a = temp%10;
				if(a==5){
					c = true;
					break;
				}
				temp = temp/10;
			}
			if(!c){
				count++;
			}
			
		}
		System.out.println("The total numbers between M and N that dont have 5 is : "+count);
	}
}
