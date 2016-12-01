import java.util.Random;

public class MethodDemo4{
	public static int random(){
		Random rd = new Random();
		int number = rd.nextInt(100);

		//return 키워드는 이 메소드를 호출한 곳에 값을 반환한다.
		return number;
	}
	public static void main(String[] args){
		int x = random();
		System.out.println(x);

		System.out.println(random());
		System.out.println(random() * 100);
		//System.out.println(a() * 100);
	}
}