public class DBAccassApp{
	public static void main(String[] args){
	//	DBAccass클래스는 생성자를 사용할 수 없다.
	//	DBAccass db1 = new DBAccass();
	//	DBAccass db2 = new DBAccass();
	//	DBAccass db3 = new DBAccass();

		DBAccass db1 = DBAccass.getInstance();
		DBAccass db2 = DBAccass.getInstance();
		DBAccass db3 = DBAccass.getInstance();
		//싱글턴 처리된 클래스의 객체 획득하기.
		//정적변수 db에 저장된 #123값을 반환받는다.
		//프로그램이 실행되는 도안 객체가 한개만 유지되도록 하는것.


		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db3);


	}
}