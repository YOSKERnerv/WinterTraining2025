class A2 
{
	public static void main(String[] args) 
	{
		// wap to print the product of odd alphabet by using for loop
		double a =1;
		for(char i = 'A';i<='Z';i++){
			if(i%2!=0){
				 a *= i;
			}
			
		}
		System.out.println("The product is:"+a);
	}
}
