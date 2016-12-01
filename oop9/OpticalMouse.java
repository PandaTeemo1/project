public class OpticalMouse implements Mouse, lightable {

	//Mouse인터페이스에 정의된 추상메소드 구현
	public void wheel(){
		System.out.println("빛을 번쩍이며 빙글 빙글");
	}
	public void click(){
		System.out.println("빛을 번쩍이며 클릭.. 클릭..");
	}
	public void move(){
		System.out.println("빛을 번쩍이며 움직... 움직..");
	}

	//lightable인터페이스에 정의된 추상메소드 구현
	public void light(){
		System.out.println("반짝 반짝 대머리");
	}
	//Cleanable인터페이스에 정의된 추상메소드 구현
	/*public void clean(){
		if(mouse instanceof Cleanable){
			((Cleanable)mouse).clean();

		} else {
			System.out.println("청소기능을 지원하지 않습니다.");
		}
	}*/
}