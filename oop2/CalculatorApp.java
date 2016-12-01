public class CalculatorApp{

	public static void main(String[] args){
			
		Calculator c = new Calculator();

		int result1 = c.Plus(2, 3, 5);
		System.out.println(result1);

		double result2 = c.Plus(2.0, 2.4, 2.5);
		System.out.println(result2);
	}
}