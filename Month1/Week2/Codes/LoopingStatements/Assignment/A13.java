class A13 
{
	public static void main(String[] args) 
	{
		//remainder without the division operator
		int a = 45;
		int b = 4;
		int q = 0;
		for(int i=1;i<a;i++){
			if((b*i)>a){
				q=a-(b*(i-1));
				break;
			}
			
		}
		System.out.println(q);
	}
}
