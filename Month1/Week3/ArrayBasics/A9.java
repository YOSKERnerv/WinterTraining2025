import java.util.*;
class A9
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements");
		//int sum = 0;
		for(int i=0;i<arr.length;i++){
				 arr[i] = sc.nextInt();
			
		}
		System.out.println("-----------------");
		for(int i=arr.length/2;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
		
	}
}
