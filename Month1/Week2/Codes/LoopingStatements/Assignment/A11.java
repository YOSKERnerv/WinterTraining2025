class A11 
{
	public static void main(String[] args) 
	{
		int sum =0;
		//give the summation of the  numbers which are divisible by 5 between Ma nd N
		for(char i = 'M';i<'N';i++){
			if(i%5==0){
				sum+=i;
			}
				
		}
		System.out.println(sum);
	}
}
