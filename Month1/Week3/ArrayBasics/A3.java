import java.util.*;
class A3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++){
			arr[i] =sc.nextInt();
		}
		System.out.println("-----------------");
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				System.out.println(arr[i]);
			}
		}
	}
}
