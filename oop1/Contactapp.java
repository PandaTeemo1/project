public class Contactapp{
	public static void main(String[] args){
		Contact c1 = new Contact();
		Contact c2 = new Contact();


		c1.no = 23;
		c1.name = "홍길동";
		c1.phoneNum = "010-1234-5678";
		c1.email = "asdf@gmail.com";

		c2.no = 25;
		c2.name = "김유신";
		c2.phoneNum = "010-4321-8765";
		c2.email = "fdsa@gmail.com";
		System.out.println(c1.name);
		System.out.println(c1.no);
		System.out.println(c1.phoneNum);
		System.out.println(c1.email);
		c1.call();
		c2.call();
		/*
		Contact[]  contacts = new Contact[10];
		contacts[3] = c1;
		contacts[4] = c2;
		*/
	}
}
//배열을 전달받아서 그 배열에서 가장 큰 값을 반환하는 메소드
//배열과 숫자를 전달받아서 그 배열에 그 숫자가 포함되어 있는지 여부를 반환하는 메소드

//인적 정보를 저장하고 그 정보를 출력하는 기능이 구현된 설계도
//public class Employee{
	//속성
	//사원번호, 이름, 전화번호, 소속부서, 직위, 급여

	//기능
	//연봉을 계싼해서 반환하는 메소드
	//사원의 모든 정보를 출력하는 메소드
}