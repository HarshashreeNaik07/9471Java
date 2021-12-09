class SuperClass{
	int b=10;
	
	public SuperClass() {
		this.b = 7;
	}
	
	int f()
	{
		return b;
	}
}
	
	class SubClass extends SuperClass{
		int b;
	}
public class Test11 {
	public static void main(String args[]) {
		SuperClass a= new SubClass();
		System.out.println(a.f());
	}
}

