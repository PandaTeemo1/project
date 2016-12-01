public class Demo12
{
	public static void main(String[] args){
		int x = 10;
		int y = 0;
		//나눗셈연산에서 0 으로 나눌 수 없다.
		// 아래의 코드는 실행시 오류가 발생한다.
		int z = x / y;
		System.out.println("z의값"+z);
	}
}