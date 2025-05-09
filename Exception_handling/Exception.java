package Exception_handling;

public class Exception {
	public static void main(String[] args) {
		int n1=24;
		int n2=0;
		int div=0;
		try {
			div=n1/n2;
		}catch(ArithmeticException exception){
			System.out.println("Dont try to divide by zero "+exception);
			exception.printStackTrace();  
		}
		finally {
			System.out.println("finally block being executed");
		}
		System.out.println(div);
	}
}

