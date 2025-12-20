class DiscountEligibility 
{
	public static void main(String[] args) 
	{
		double totalCart = 3325.45;
		// let the special discount be 10 percent of total!!
		double discount  = totalCart - (totalCart/10);
		
		double newPrice = (totalCart>=2000)? discount : totalCart;
		System.out.println("The total Price is : "+newPrice);
		
	}
}
