public class Demo14
{
	public static void main(String[] args){
		// 비교 연산자
		// 비교 연산자의 연산결과는 항상 true, false 값 중에 하나다.

		int x = 30;
		int y = 20;

		boolean z = x > y ;

		System.out.println("z의값:"+z);

		z = (x == y);
		System.out.println("z의 값:"+z);

		z = (x != y);
		System.out.println("z의 값:"+z);
	}
}