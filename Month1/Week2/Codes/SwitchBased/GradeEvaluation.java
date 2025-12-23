import java.util.*;
class GradeEvaluation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rating of the movie from 1-10");
		int marks  = sc.nextInt();
		int a =0;
		if(marks>0 && marks <=30){
			a=1;
		}else if(marks >30 && marks <=60){
			a = 2;
		}else if(marks >60 && marks <=80){
			a = 3;
		}else if(marks >80 && marks <=100){
			a=4
		}else{
				System.out.println("Enter the correct marks");
		}
		
		switch(a){
			case 1:
				System.out.println("Fail");
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
				System.out.println("Congratulation");
		}
	}
}
