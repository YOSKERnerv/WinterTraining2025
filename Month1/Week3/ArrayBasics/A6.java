import java.util.*;
class A6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		System.out.println("Enter the elements");
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				sum+=sc.nextInt();
			}
		}
		System.out.println("-----------------");
		
		System.out.println("Sum of even elements of the arra is :"+sum);
	}
}
