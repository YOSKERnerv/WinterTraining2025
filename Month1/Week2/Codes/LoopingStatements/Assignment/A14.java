import java.util.*;
class A14 
{
	public static void main(String[] args) 
	{
		//print the number between A and Z except the number which has 7 in it
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of M : ");
		int m = sc.nextInt();
		System.out.println("Enter the value of N : ");
		int n = sc.nextInt();
		for(int i=m ;i<=n;i++){
			int temp = i;
			int a = 0;
			int c = -5;
			while(temp!=0){
				a = temp%10;
				if(a==7){
					c = -1;
					break;
				}
				temp = temp/10;
			}
			if(c== -1){
				continue;
			}else{
				System.out.println(i);
			}
		}
		// 1 - 34
		// 2,12,20-29,32
		//25262
		
		
		
	}
}
