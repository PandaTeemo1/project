public class FinalDemo2{
	//생성된 객채마다 다른 값을 가질 수 있지만
	// 하번 값이 할당된 이후에는 값을 변경할 수 없다.
	private final int x;
	private int y;
	
	public FinalDemo2(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}

	/*final로 지정된 변수는 setter를 사용해서 값을 변경 할 수 없다.
	public void setX(int x){
		this.x = x;
	}생성될때만 값변경이 가능.*/
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y = y;
	}
}