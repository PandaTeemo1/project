public class BallMouse implements Mouse, Cleanable{

	//Mouse인터페이스에 정의된 추상메소드 구현	
	public void wheel(){
		System.out.println("빙글비으글");
	}
	public void click(){
		System.out.println("쿨럭쿨럭");
	}
	public void move(){
		System.out.println("대굴대굴");
	}
	public void clean(){
		System.out.println("Ball의 먼지 제거 완료....");
	}
}