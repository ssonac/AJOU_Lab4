public class CalculatorTest {

	public static void main(String[] args){
		Calculator cal = new Calculator();
		
		System.out.println("Add 3,5 :"+cal.add(3, 5));
		System.out.println("Substract 3,5 :"+cal.subract(3,5));
		System.out.println("Divide 3,5 :"+cal.divide(3, 5));
		System.out.println("Multiply 3,5 :"+cal.multiply(3,5));
		System.out.println("Remainder 3,5 "+cal.remainder(3, 5));
		System.out.println(cal.toString());	
	}
}
