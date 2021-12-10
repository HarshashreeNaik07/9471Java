public class Main6 {
	public static void main(String args[]) {
		try {
			doMath(5);
			System.out.print("hi");
		}
		finally {
			System.out.println(" from finally");
			
		}
	}
	public static void doMath(int den) {
		int num=7/den; 
	}

}
