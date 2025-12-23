class A6 
{
	public static void main(String[] args) 
	{
		//summation of even and odd number between M and N
		int e=0,o=0;
		for(char i = 'M' ;i<='N';i++){
			if(i%2==0){
				e += i;
			}else{
				o+=i;
			}
		}
		int total  = o+e;
		System.out.println("The sum of even is  : "+e+"\nThe sum of odd is : "+o+"\nAnd the total sum is : "+total);
	}
}
