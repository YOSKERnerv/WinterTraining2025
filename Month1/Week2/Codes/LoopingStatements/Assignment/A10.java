import java.util.*;
class A10 
{
	public static void main(String[] args) 
	{
		//Count the numbers which are divisible by 7 between Ma nd N
		int count  =0;
		
		for(char i = 'M';i<'N';i++){
			if(i%7==0) count++;
		}
		System.out.println(count);
	}
}
