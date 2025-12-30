import java.util.*;
class A14
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements");
		int max = 0;
		for(int i=0;i<arr.length;i++){
				 arr[i] = sc.nextInt();
				 
				 if(arr[i]>max){
					 max = arr[i];
				 }
		}
		System.out.println("-----------------");
		System.out.println(max);
		
		
		
		
	}
}
