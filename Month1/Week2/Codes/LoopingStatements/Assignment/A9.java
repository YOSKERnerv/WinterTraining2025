import java.util.*;
class A9 
{
	public static void main(String[] args) 
	{
		//Table without multiplication operator
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = n;
		for(int i=1;i<=10;i++){
			System.out.println(n+"X"+i+"="+t);
			t+=n;
			
		}
	}
}
