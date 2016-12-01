public class PhoneApp2{
	public static void main(String[] args){
		SmartPhone p1 = new SmartPhone();
		PeaturePhone p2 = new PeaturePhone();
		//p1 참조변수는 smartphone을 참조하고 있기 때문에
		//peaturephone객채으이 필드와 속성에 접근가능하고,
		//phone 객채의 필드와 속성에 접근가능하다.
		p1.ip = "255.255.255.0";			//SmartPhone에 정의된 필드
		p1.web("http://www.naver.com");		//SmartPhone에 정의된 메소드
		p1.telNumber = "011-123-1234";		//Phone에 정의된 필드
		p1.call("017-444-2222");			//Phone에 정의된 메소드
		


		//SmartPhone 과 PeaturePhone을 Phone 타입의 참조변수에 담기.
		//상속관계에 있는 클래스 일 경우 부모타입의 참조변수에 자식클래스 타입의 객체를 저장할 수 있다.
		Phone p3 = new SmartPhone();
		Phone p4 = new PeaturePhone();


		//p3.web("www.daum.net"); 컴파일오류
		p3.telNumber = "018-234-2123";
		p3.call("334-3434");
		//System.out.println(p2);
		//System.out.println(p3);
	}
}