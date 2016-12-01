public class Demo10
{
	public static void main(String[] args){
		//산술 연산자

		int a = 10;
		int b = 5;
		//연산은 항상 새로운 값을 생성해낸다.
		//반드시 그 값을 변수에 담자.
		int c = a + b;

		int d = a - b;
		int e = a*b;
		int f = a/b;
		int g = a%b;
		System.out.println(g);
		//연산자는 문자열과 관련 있을 경우 이어붙이기로 동작한다.
		//"문자열" + 숫자 = "문자열숫자"
		// 숫자 + "문자열" = "숫자문자열"
		//문자열 + 문자열 = 문자열문자열

		String x = "가나다라";
		String y = "hello";

		String z = x + y;
		System.out.println(z);

		System.out.println(3 + 6 + "Hello");
		// 3+ 6= 9 + Hello = 9Hello
		System.out.println("Hello" + 3 + 6);
		// Hello+3 = Hello3 + 6 = Hello36

		System.out.println("Hello" + (3 + 6));
		// Hello + (9) = Hello9

		int kor = 70;
		int eng = 80;
		int math = 20;

		System.out.println("총점:"+ (kor + eng + math));
		//총점:170
	}
}