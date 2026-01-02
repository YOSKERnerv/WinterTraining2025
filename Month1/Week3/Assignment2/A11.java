import java.util.*;
class A11
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements");
		int max =0;
		int smax = 0;
		for(int i=0;i<arr.length;i++){
				 arr[i]= sc.nextInt();
				 
		}
		
		for(int i=0;i<arr.length/2;i++){
			if(max<arr[i]){
					max = arr[i];
			}
		}
		System.out.println("-----------------");
		System.out.println(Arrays.toString(arr));
		System.out.println("-----------------");
		
		System.out.println(max);
				
	}
}
