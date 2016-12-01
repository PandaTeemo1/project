public class Demo9
{
	public static void main(String[] args){
		//연산식에서의 형변환
		int a = 4;
		int b = 5;
		int c = a/b;
		//연산에 참여한 값이 정수기 때문에
		//연산의 결과 0.8을 정수 0으로 변환한 결과값이 얻어진다.
		System.out.println(c);

		double d = a/(double)b; // 4/5.0 -> 4.0/5.0 -> 0.8
		System.out.println(d);
	}
}