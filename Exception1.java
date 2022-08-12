package project2;

public class Exception1 {
	public static void main(String[] args) {
		int i=50/0;
		try {
			int i1=50/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			
			
		}
		System.out.println("print rest of the code");

	}

}


