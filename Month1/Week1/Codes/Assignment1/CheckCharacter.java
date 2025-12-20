import java.util.*;
class CheckCharacter 
{
	public static void main(String[] args) 
	{
		//Question :
		// Check if the character is alphabet, vowel, uppercase, Lowercase, Consonent, digit or Special Character.
		//Scanner sc = new Scanner(System.in);
	
		
		char ch = 'r';
		boolean uC = ch>='A' && ch<='Z';
		boolean lC = ch>='a' && ch<='z';
		boolean uVowel = ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
		boolean lVowel = ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
		boolean digit = ch>='0' && ch<='9';
		boolean alph = ch>='A'&& ch<='Z'|| ch>='a' && ch<='z';
		
		String result =  alph? "Alphabet :"+(lC?"LowerCase :"+(lVowel?"Vowel":"Consonent"):"UpperCase : "+(uVowel?"Vowel":"Consonent")):digit?"Digit":"Special Character";
		System.out.println(result);
		
	}
}
