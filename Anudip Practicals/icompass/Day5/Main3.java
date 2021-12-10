class Test extends Exception{}
class Main3{
	public static void main(String args[]) {
		try {
			throw new Test();
		}
		catch(Test t) {
			System.out.println("Got the Exception");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
}
