public class Carapp{ 
	public static void main(String[] args){
		
		/* Car c 
			Car 라는 설계도를 사용해서 생성된 객체의 주소값을 담는 변수 c를 만든다.
			Car타입(class,참조)의 변수 c(참조변수)를 만든다.
		  new Car();
			Car 설계도를 로드해서 객체를 생성하고
			생성된 객체를 참조 할 수 있는 주소값을 Car타입의 변수 c에 저장해라.
			*/
		car c = new car();
		System.out.println(c);

		car c2 = new car();
		System.out.println(c2);
		//생성된 객체의 필드, 생성된 객체의 메소드를 사용하기.
		//@<-기준 오른쪽해쉬코드(객체의 시리얼번호라고 생각하면됨)

		System.out.println(c.speed);
		c.speed = 10;
		
		System.out.println(c.speed);
		c.speedUp();
		System.out.println(c.speed);
		c.speedDown();
		System.out.println(c.speed);

	}
}