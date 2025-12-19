class EvenOddNeutral 
{
	public static void main(String[] args) 
	{
		//    ######### Even or Odd number and positive or negative and neutral or not   ########
		
		int a = -45;
		String res = (a%2==0)?"Even":"Odd";
		System.out.println(res);
		
		String res1 = (a==0)?"Neutral":(a>0)?"Positive":"negative";
		System.out.println(res1);
	}
}
