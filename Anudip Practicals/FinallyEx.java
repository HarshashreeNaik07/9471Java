public class FinallyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr = new int[2];
			System.out.println(arr[3]);
		}
		catch(Exception e) {
			System.out.println("Error is thrown:  "+e);
		}
		finally {
			System.out.println("finally is block");
		}
		System.out.println("Out of Try Catch & Finally");

	}

}
