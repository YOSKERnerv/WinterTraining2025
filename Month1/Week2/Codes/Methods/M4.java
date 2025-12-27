class M4 
{
	public static void main(String[] args) 
	{

		m1(m2(),m3(200),100); //actual args
		
	}
	public static void m1(int c,int b,int a){// formal args
		System.out.println("m1()->"+a);
		System.out.println("m2()->"+b);
		System.out.println("m3()->"+c);
	}
	public static int m2(){
		return 50;
	}
	public static int m3(int a){
		return a;
	}
}
