public class Demo4{
	public static void main(String[] args){
		//문자 타입 - 한 글자를 저장하는 자료형
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		//한글자만 표현가능. 오류
		char c4 = 'AB';
	}
}