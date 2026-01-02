import java.util.*;
class A5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++){
				 arr[i]= sc.nextInt();
		}
		System.out.println("-----------------");
		
		System.out.println(arr[arr.length/2]);
				
	}
}
