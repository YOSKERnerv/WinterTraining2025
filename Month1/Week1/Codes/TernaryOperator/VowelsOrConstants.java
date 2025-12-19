class VowelsOrConstants 
{
	public static void main(String[] args) 
	{
		//questions : 
		//whether it is lower case or not // DONE
		// if it is Alphabet or not  
		//if it is digit or not // DONE
		// if it is upper case or lower case // DONE
		// if the alphabet is vowel or constant
		// if the amount can be withdrawl or not
		// if it is even number or not
		// if the age is valid or not 
		// if positve not negative number
		// if it is nutral number or not
		
		//           ######  Vowels OR Not  #######
		char a = 'b';
		String res0 = (a == 'a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')?"Vowel":"Constant";
		System.out.println(res0);		
		
		//           ######  amount Withdrawl  #######
		double Totalamount  = 123466734;
		double amount  = 23534.45;
		String res4 = (amount<Totalamount)?"Withdrawn":"Insufficient Balance";
		System.out.println(res4);
		
		
		
		//    ######### Even or Odd number and positive or negative and neutral or not   ########
		
		int z = -45;
		String res = (z%2==0)?"Even":"Odd";
		System.out.println(res);
		
		String res1 = (z==0)?"Neutral and Positive":(z>0)?"Positive":"negative";
		System.out.println(res1);
		
		// ########      age valid or not ########
		
		int age  = 34;
		String res2 = (age>=18)?"valid":"Not Valid";
		System.out.println(res2);
		
		//  ##########  Lower or Upper case  #####
		
		char b = 'U';
		String res3 = (a>='a' && a<='z')?"Lower":"Upper";
		System.out.println(res3);
		
		char d = 'c';
		String res5 = (a>='A' && a<='Z')?"Upper":"Not Upper";
		System.out.println(res5);
		
	}
}
