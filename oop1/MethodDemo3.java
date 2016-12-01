import java.util.Random;

public class MethodDemo3{
	// 난수를 발생시키는 메소드 만들기
	public static int random(){
		Random rd = new Random();
		int number = rd.nextInt(100);

		//return 키워드는 이 메소드를 호출한 곳에 값을 반환한다.
		return number;
	}

	public static void main(String[] args){
		int x = random();
		System.out.println(x);

		
	}

}