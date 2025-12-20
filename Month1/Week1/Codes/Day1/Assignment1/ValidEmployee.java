class ValidEmployee 
{
	public static void main(String[] args) 
	{
		//An employee can enter the office if they have an ID card and are either a permenent employee or a contract employee with manager approval.
		
		boolean pemployee = false;
		boolean tempEmployee = true;
		boolean ID = true;
		boolean managerApproval = false;
		
		String result  = (pemployee == true)||(tempEmployee == true && managerApproval==true) && (ID == true)?"Valid Employee":"Invalid Employee";
		System.out.println(result);
		
	}
}
