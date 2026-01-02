import java.util.*;
class A2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements");
		int sum = 0;
		for(int i=0;i<arr.length;i++){
				 arr[i] = sc.nextInt();
		}
		System.out.println("-----------------");
		//int avg = sum/arr.length;
		//System.out.println(avg);
		for(int i=0;i<arr.length;i=i+2){
			System.out.println(arr[i]);
			
		}
		
		
		
	}
}
