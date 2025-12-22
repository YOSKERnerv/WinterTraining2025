import java.util.*;
class  CabBooking
{
	public static void main(String[] args) 
	{
		boolean userLocationServiceable = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the waiting time");
		int waitingTime   = sc.nextInt();
		
		if(waitingTime<15){
			System.out.println("The waiting time is :"+waitingTime);
			if(userLocationServiceable==true){
				System.out.println("Please select the number of  payment mode: \n 1. UPI \n 2. Cash)");
				int paymentMode = sc.nextInt();
				if(paymentMode==1){
					System.out.println("Your payment mode is : UPI \n Have a safe jouney");
				}else if(paymentMode==2){
					System.out.println("Your payment mode is : Cash \n Have a safe jouney");
				}else{
					System.out.println("Invalid Payment Mode");
				}
			}else{
				System.out.println("No service in this location");
			}
			
		}else{
			System.out.println("Driver not avaliable");
		}
		
		//if(driver ==true && userLocation == true && payMode = true){
			//System.out.println("Cab has been booked");
			
	}
}