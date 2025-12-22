import java.util.*;
class ShoppingCart 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		int cartCap = 3;
		boolean cart = true;
		boolean add = true;
		if(cartCap>0 && add== true){
			System.out.println("Do you want of add this item? 1 for yes and 2 for no"){
			int ad = sc.nextInt();
			if(ad==1){
				cartCap--;
				System.out.pritln("Your item has been added to cart");
			}else{
				System.out.println("Item cancelled");
			}
		}else if(cartCap==0 && add==true){
			System.out.println("Cart is full");
		}else{
			System.out.println("invalid address");
		}
	}
}
