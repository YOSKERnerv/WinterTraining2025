import java.util.*;
class A4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		System.out.println("Enter the elements");
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			//arr[i] =sc.nextInt();
			sum += sc.nextInt();
		}
		System.out.println("The sum of elements are : "+sum);
		
	}
}
