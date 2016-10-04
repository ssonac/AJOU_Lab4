
public class Calculator {

	public double add(double x, double y) {
		double a = x + y;
		return a;
	}

	public double subract(double x, double y) {
		double result = x - y;
		return result;
	}

	public double divide(double x, double y) {
		if (y == 0) {
			System.out.println("Error: Division is Zero!!");
			return -1;
		}
		double result = x / y;
		return result;
	}

	public double multiply(double x, double y) {
		double m = x * y;
		return m;
	}

	public int remainder(double x, double y) {
		int result = (int) (x % y);
		return result;
	}

	public String toString() {
		// return member names, IDs, and repository URI
		String s = "Lee Hangyu, Nam Muntae, Lee Minju_ssonac, muntaeNam, Minnnn_https://github.com/ssonac/AJOU_Lab4.git";
		return s;
	}
}
