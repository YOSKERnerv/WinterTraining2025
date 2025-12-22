class CompanyBonus 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your expreince in years : ");
		int exp = sc.nextInt();
		System.out.println("Enter your performance Rating: ");
		int per = sc.nextInt();
		
		if(exp>5 && per>4){
			if(per>4){
				System.out.println("You got the bonus");
			}else{
				System.out.println("You have the experince but not performance");
			}
		}else{
			System.out.println("Nope");
		}
	}
}
