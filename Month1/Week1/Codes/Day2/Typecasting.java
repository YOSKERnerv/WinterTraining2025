class Typecasting 
{
	public static void main(String[] args) 
	{
		// perfom narrowing and widening
		
		byte a = 34;
		int b = a;
		long c = b;
		double d =c;
	

		
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		System.out.println("c :"+c);
		System.out.println("d :"+d);
		//System.out.println(b);
		
		//performing narrowing
		
		double e = 23534;
		int f = (int)e;
		float g = (float)e;
		byte h = (byte)f;
		System.out.println("e :"+e);
		System.out.println("f :"+f);
		System.out.println("g :"+g);
		System.out.println("h :"+h);
		
		
		
		
	}
}
