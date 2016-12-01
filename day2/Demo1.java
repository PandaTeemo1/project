public class Demo1{
	public static void main(String[] args){
		//정수 타입
		byte b1 = 23;
		byte b2 = -126;
		//byte b3 = 128; 자료형의 범위를 벗어나 오류가 발생남

		int a1 = 120;
		int a2 = -120;
		
		long c1 = 100000;
		long c2 = 100000000000000000L;
		//숫자의 범위가 int의 범위를 벗어나는 값일 경우 반드시
		//숫자끝에 L을 표시해야 한다.
		long c3 = 100000000000L;

		int m1 = 10; //10진수 10을 표현
		int m2 = 012; //0으로 시작하면 8진수로 생각함.
		int m3 = 0xA; // 16진수로 10을 표현

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);


		//java7 부터 숫자를 적을때 자릿수를 표현하기 위해서 _ 사용이 가능.
		int m4 = 100_000_000;
		int m5 = 5;
		System.out.println(m4*m5);
	}

}