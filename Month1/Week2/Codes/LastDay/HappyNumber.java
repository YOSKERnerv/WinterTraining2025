class HappyNumber 
{
	public static void main(String[] args) 
	{
		int count   =0;
		 for(int i=0;i<=500;i++){
			 happpynum(i,count);
		 }
	}
	//public static void happy(){
		//int count   =0;
		//for(int i=0;i<=500;i++){
			//int sum = 0;
			//int temp = i;
			//while(temp>=0){
				//int a = temp%10; //21 > a = 1;
				//sum += a*a; //sum = 1; 25+ 
				//temp = temp/10;
				//if(sum==1){
					//count++;
					//System.out.println(i);
				//}
				//if(temp<10){
					//temp = sum;
				//}
				
			//}	
		//}
		//System.out.println("The total number of happy numbers are : "+count);
	//}
	
	public static int happynum(int i,int count){
		int temp =i;
		boolean b = true;
		int sum  =0;
		while(b){
			int a = temp%10;
			sum += a*a;
			
			if(sum==1){
				System.out.println(i);
				count++;
				b = false;
			}
		}
		return count;
	}
	
}
