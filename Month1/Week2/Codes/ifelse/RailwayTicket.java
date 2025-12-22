import java.util.*;
class RailwayTicket 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Welcome to booking Counter!");
		Scanner sc = new Scanner(System.in);
		int totalSeatsav =3;
		System.out.println("Select 1 to Book-Seat and 2 for Cancel ");
		int seatbook = sc.nextInt();
		boolean rac = true;
		int racSeats = 1;
		if(seatbook==1 && totalSeatsav>0){
			totalSeatsav--;
			System.out.println("Your seat has been booked");
		}else if(seatbook==2){
			System.out.println("Thank you visit again");
		}else if(totalSeatsav==0 && rac ==true && racSeats>0){
			System.out.println("You have been put to waiting list");
			racSeats--;
		}else{
			System.out.println("Cancelled");
		}
		
	}
}
