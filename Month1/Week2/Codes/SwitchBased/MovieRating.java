import java.util.*;
class MovieRating 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rating of the movie from 1-10");
		int rating  = sc.nextInt();
		int a =0;
		if(rating>0 && rating <=3){
			a=1;
		}else if(rating >3 && rating <6){
			a = 2;
		}else if(rating >5 && rating <8){
			a = 3;
		}else if(rating >7 && rating <=10){
			a=4
		}else{
				System.out.println("Enter the correct rating");
		}
		
		switch(a){
			case 1:
				System.out.println("Poor");
				break;
			case 2:
				System.out.println("Average");
				break;
			case 3:
				System.out.println("Good");
				break;
			case 4:
				System.out.println("Excellent");
				break;
			default:
				System.out.println("Enter valid number");
		}
				
		
	}
}
