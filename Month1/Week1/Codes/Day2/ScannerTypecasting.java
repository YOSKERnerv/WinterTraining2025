import java.util.Scanner;
class ScannerTypecasting
{
	public static void main(String[] args) 
	{
		System.out.println("Taking input as a byte and Saving it as a int");
		Scanner sc = new Scanner(System.in);
		int a = (int) sc.nextByte();
		System.out.println(a);
		
		//String b = (String) sc.nextInt();
		//System.out.println(b);
		System.out.println("Long as int");	
		int c = (int) sc.nextLong();
		System.out.println(c);
		
		
		
	}
}
