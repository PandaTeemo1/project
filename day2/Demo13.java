public class Demo13
{
	public static void main(String[] args){
		//증감연산자
		// ++ 1씩 증가 --1씩 증감

		int a = 3;
		a++;
		++a;
		System.out.println("a의값:"+a);

		--a;
		a--;
		--a;
		System.out.println("a의값:"+a);

		int x = 10;
		int y = 10;
		//증감연산자를 다른 연산자와 혼용해서 사용하면
		//증감연산자의 위치에 따라서 다른 결과가 지장될 수 있기 때문에
		//가능하면 다른 연산자와 혼용해서 사용하지 말자.
		int m = x++; //x의값을 m에 대입하고 증가
		int n = ++y; //y의 값을 증가하고 n에 대입

		System.out.println("m의 값:"+m);
		System.out.println("n의 값:"+n);
		System.out.println("x의 값:"+x);
		System.out.println("y의 값:"+y);
	}
}