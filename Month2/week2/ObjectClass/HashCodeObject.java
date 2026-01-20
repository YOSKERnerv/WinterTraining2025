class HashCodeObject 
{
	public static void main(String[] args) 
	{
		A  a =new A();
		System.out.println(a.hashCode()); // it will give a number ;;
		System.out.println("Yosker".hashCode());
		System.out.println("Sagar".hashCode());
		
	}
}
class A
{
	String name = "Hell";
	@Override
	public int hashCode(){
		return name.hashCode();
	}
}
