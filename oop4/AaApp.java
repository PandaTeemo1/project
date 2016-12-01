public class AaApp{
	public static void main(String[] args){

		//static 변수는 객체 생성없이 클래스명.변수명으로 사용가능.
		System.out.println(Aa.y);//static 맴버는 클래스형 변수 .클래스형메소드()형식으로 사용

		//정적 변수는 y에 값 할당하기
		//Aa클래스를 사용해서 만든 모든 객체는 정적변수 y값을 공유한다.
		//Aa.y = 100;

		//멤버변수 x는 생성된 객채마다 개별적으로 생성한다.
		//각각의 객채는 객채마다 다른 x값을 가질 수 있다.
		Aa a1 = new Aa();
		//a1.x = 10;
		System.out.println(a1.x);
		System.out.println(Aa.y);
		Aa a2 = new Aa();
		//a2.x = 20;
		System.out.println(a2.x);
		//값은 표현되지만 y값을 멤버변수로 오해가능성이 있음.
		System.out.println(Aa.y);
		Aa a3 = new Aa();
		//a3.x = 30;
		System.out.println(a3.x);
		System.out.println(Aa.y);




	}
}