import java.util.*;
class A1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements");
		int min = 0;
		for(int i=0;i<arr.length;i++){
				 arr[i] = sc.nextInt();
				 if(arr[i]<min){
					 min=arr[i];
				 }
		}
		System.out.println("-----------------");
		//int avg = sum/arr.length;
		System.out.println(min);
		
		
		
		
	}
}
