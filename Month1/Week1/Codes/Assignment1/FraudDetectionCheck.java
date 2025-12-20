class FraudDetectionCheck 
{
	public static void main(String[] args) 
	{
		//An order is flaged for review if the order amount is greater than the average order value.
		// here the the ternary operator is used as we need to find if the value exced or not and then give the ouput if it is flagged or not .
		
		int averageValue  = 325;
		int  orderAmount  = 342;
		
		String flagged  = (orderAmount>averageValue)?"Flagged for review":"Nothing wrong";
		System.out.println(flagged);
		
		
		
	}
}
