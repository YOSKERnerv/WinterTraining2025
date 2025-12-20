import java.util.Scanner;
class Practice1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the int value a:");
		int a = sc.nextInt();
		System.out.println("a :"+a);
		
		sc.nextLine();// if u dont put this line the nextLine will not work and skip entirly
		
		
		System.out.println("nextLine() value b:");
		String b = sc.nextLine();
		System.out.println("b :"+b);
		
		
		System.out.println("next() value c:");
		String c = sc.next();
		System.out.println("c :"+c);
		sc.nextLine();
		
		System.out.println("nextLine() value d:");
		String d = sc.nextLine();
		System.out.println("d:"+d);
		
		sc.close();
		
	}
}
