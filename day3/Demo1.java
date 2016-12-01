public class Demo1
{
	public static void main(String[] args){
		//논리 연산자
		int x = 10;
		int y = 10;
		
		//&&는 좌변이 false이면 우변을 평가하지 않고 false로 결과값이 나옴
		boolean result1 = false && x++ > 10 ;
		boolean result2 = false & y++ > 10;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println("x:"+x); //x는 10의 값이 출력됨
		System.out.println("y:"+y); //y는 11의 값이 출력됨
	}
}