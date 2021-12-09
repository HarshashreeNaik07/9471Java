public class Test8 {
	static void methodA(short s)
	{
		System.out.println("methodA(short)called");
		
	}
	static void methodA(int i)
	{
		System.out.println("methodA(int)called");
		
	}
static void methodB(float f)
{
	System.out.println("methodB(float)called");
}
static void methodB(double d)
{
	System.out.println("methodB(double)called");
}
	public static void main(String[] args) {
		methodA(5);
		methodB(5.2);
	}
}
