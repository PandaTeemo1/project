public class DBAccass{

	private static DBAccass db = new DBAccass();

	//생성자를 은닉화시킨다.
	private DBAccass(){
		
	}
	//생성된 DBAccass 객채를 참조할 수 있는 참조값을 제공해주는
	//정적 메소드를 제공한다.
	public static DBAccass getInstance(){
		return db;
	}
	public void insert(){
		System.out.println("추가 작업");
	}
	public void update(){
		System.out.println("수정 작업");
	}
	public void deleta(){
		System.out.println("삭제 작업");
	}
	public void retrieve(){
		System.out.println("조회 작업");
	}
}