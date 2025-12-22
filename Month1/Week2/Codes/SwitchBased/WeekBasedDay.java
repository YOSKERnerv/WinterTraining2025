import java.util.*;
class WeekBasedDay
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day num from 1 to 7");
		int a = sc.nextInt();
		int num=0;
		if(a<7){
			num=1;
		}
		switch(num){
			case 1:
				System.out.println("Weekday");
				break;
			default:
				System.out.println("Weekend");
		}
				

		switch (a) {
			case 1:
				System.out.println("Monday");
				break;

			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;

			default:
				System.out.println("Invalid day");
			}
	}
}
