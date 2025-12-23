class A12 
{
	public static void main(String[] args) 
	{
		int a  =34;
		int b = 4;
		//now find quotient without division operator
		int q = 0;
		for(int i=1;i<a;i++){
			if((b*i)>a){
				q=(i-1);
				break;
			}
			
		}
		System.out.println(q);
	}
}
