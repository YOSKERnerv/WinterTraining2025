import java.util.*;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the Method :\n1. addition\n2. subtraction \n3. multiplication \n4. division /n5.modulos");
		int method = sc.nextInt();
		
		switch(method ){
			case 1 :
				num1+num2;
				break;
			case 2 :
				num1-num2;
				break;
			case 3 :
				num1-num2;
				break;
			case 4 :
				num1/num2;
				break;
			case 5 :
				num%num2;
				break;
			default :
				System.out.println("Please select valid method");
		}
			
		
	}
}
