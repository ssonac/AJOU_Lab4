
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public double add (double x, double y){
		double a = x+y;
		return a;
		}
	
	public double subract (double x, double y){
		return 0;
		}
	
	public double divide (double x, double y){
		return 0;
		}
	
	public double multiply (double x, double y){
		double m = x*y;
		return m;
		}
	
	public int remainder (double x, double y){
		int result=(int)(x%y);
		return result;
		
		}
	public String toString (){
		//return member names, IDs, and repository URI
		String s= "Lee Hangyu, Nam Muntaek, Lee Minju_ssonac, muntaekNam, Minnnn_https://github.com/ssonac/AJOU_Lab4";
		return s;
	}
}
