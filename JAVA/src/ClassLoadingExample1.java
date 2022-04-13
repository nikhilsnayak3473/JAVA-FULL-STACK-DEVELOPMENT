class ClassLoadingExample1
{
	static int a = test();
	static int b = 20;
	static
	{
		System.out.println(b);
		b = 40;
	}
	public static int test()
	{
		System.out.println(b);
		return 10;
	}
	public static void main(String[] args)
	{
		test();
	}
}

