public class Demo11
{
	public static void main(String[] args){
		//대입 연산자 오른쪽에 값을 왼쪽에 저장
		// 연산우선 순위가 가장 낮다.
		// 우변의 값을 좌변에 대입한다.
		int a = 20;
		int b = a;

		System.out.println("a값:"+a);
		System.out.println("b값:"+b);

		int x = 10;
		x = x + 3; // x의 값에 3을 더한 값을 다시 x에 대입한다.
		x += 3; // x의 값을 3 증가시킨다.
		System.out.println("x의값"+x);
		x=3;//x의값을 3으로 변경.
		
		x= x -3;
		x -= 3;
		System.out.println("x의값"+x);
	}
}