class PaymentVerification 
{
	public static void main(String[] args) 
	{
		// An order is confirmed only if the paid amount is same as orderd amount
		double paid = 3536.45;
		double orderPrice = 353.43;
		String confirm = (paid==orderPrice)?"Sucessfull":"Failed,Amount pending: "+(paid - orderPrice);
		System.out.println(confirm);
	}
}
