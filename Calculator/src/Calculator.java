
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public double add (double x, double y){
		return 0;
		}
	
	public double subract (double x, double y){
		double result = x-y;
		return result;
		}
	
	public double divide (double x, double y){
		if(y==0)
		{
			System.out.println("Error: Division is Zero!!");
			return -1;
		}
		double result=x/y;
		return result;
		}
	
	public double multiply (double x, double y){
		return 0;
		}
	
	public int remainder (double x, double y){
		//int result=x/y;
		//return result;
		return -1;
		}
	
	public String toString (){
		return null;
	}
}