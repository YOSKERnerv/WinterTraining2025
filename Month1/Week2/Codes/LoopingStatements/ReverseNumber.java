class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		System.out.println("Original Number : "+num);
		int temp = num;
		int l  =1000;
		num = 0;
		while(temp=0){
			
			int a  = temp%10; //a=4,3,2,1,0
			num += a*l; //4000+300+20+1
			temp  = temp/10; //temp=123,12,1
			l /= 10; // 1000,100,10
			
		}
		System.out.println("Reversed Number : "+num);
		
		//System.out.print("Reversed Number : ");
		//while(num!=0){
			//int a  = num%10; //a=4,3,2,1,0
			//System.out.print(a);//4321
			//num  = num/10; //num=123
			
		//}
		
		
		
		
		
	}
}
