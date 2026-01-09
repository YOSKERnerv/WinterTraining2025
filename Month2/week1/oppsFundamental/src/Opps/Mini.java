package Opps;

import java.util.Scanner;

class Mini extends Ola{
	private int pkm;
	private String drop;
	private double price;
	Mini(String username,long contactNumber,double uberAccBalance, int pkm,String drop,double price){
		super(username,contactNumber,uberAccBalance);
		this.pkm = pkm;
		this.drop = drop;
		this.price = price;
	}
	
	
	public boolean bookCab() {
		if(super.login()) {
			int total = uberAccBalance - price;
			if(total<=0) {
				return false;
			}
			return true;
		}
	}
	public void display() {
		if(bookCab()) {
			System.out.println("Your Mini cab has been booked with price"+price);
			System.out.println("You are "+drop+"km from your uber");
			System.out.println("Your drop location is : "+drop);
		}else {
			System.out.println("Insufficent account balance ");
		}
	}
	public void cancelRide() {
		System.out.println("Do you want to cancel the ride?");
		Scanner sc = new Scanner(System.in);
		String cancel = sc.nextLine();
		if(cancel.equals("y")) {
			System.out.println("Your ride has been cancled");
		}else {
			System.out.println("Thank you for visiting yes!!!");
		}
}
