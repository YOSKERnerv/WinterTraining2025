class  lockedAccount
{
	public static void main(String[] args) 
	{
		int loginTry = 0;
		boolean Locked = false;
		
		String result  = (loginTry>3)?"Account Locked":"Login Successfull";
		System.out.println(result);
	}
}
