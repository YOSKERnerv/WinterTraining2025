class M2 
{
	static void test(long a) {
        System.out.println("long");
    }

    static void test(Integer a) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        test(5);
		m1();
    }
	public static m1(){
		int x = 100;
		return x;
	}

}
