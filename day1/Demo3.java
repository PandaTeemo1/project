public class Demo3{
	public static void main(String[] args){
	
		//정수 담는 int 타입의 그릇 a를 만들고 30을 대입해라
		int a = 30;
		int b = 40;

		// 화면에 a라는 변수(이름을 가진 저장소)에 들어있는 값을 출력해라
		System.out.println(a);
		// 화면에 b라는 변수에 들어있는 값을 출력해라
		System.out.println(b);
		// 화면에 "a"라는 텍스트(문자열)을 출력해라
		System.out.println("a");
		//a라는 이름을 가진 저장소에 50의 값을 대입해라
	
		a = 50;
		System.out.println(a);

		//a저장소에는 정수 외의 값을 담을 수 없다.
		//아래 코드는 에러다.
		a="가";
	}

}