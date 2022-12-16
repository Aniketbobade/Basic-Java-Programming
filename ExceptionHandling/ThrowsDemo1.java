package ExceptionHandling;

class Demo {
	int devision(int dividend, int divisor) throws ArithmeticException {
		int result;
		if (divisor == 0) {
			throw new ArithmeticException("Divisor can not zero");
		}
		result = dividend / divisor;

		return result;
	}
}
	public class ThrowsDemo1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Demo obj = new Demo();
			int res = 0;
			try {
				res = obj.devision(12, 0);
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("handled");
				e.printStackTrace();
			} finally {
				System.out.println(res);
			}
		}

	}

