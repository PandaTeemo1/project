public class Demo4
{
	public static void main(String[] args){
		//비트 연산자

		int a = 4;
		int b = 6;

		int result = a & b;
		System.out.println(result);
		result = a | b;
		System.out.println(result);
		result = a ^ b;
		System.out.println(result);
		result = ~a;
		System.out.println(result);


		
		

		int c = -15;
		result = c >> 2;
		System.out.println(result);
		result = c << 2;
		System.out.println(result);
		result = c >>> 2;
		System.out.println(result);
	}
}