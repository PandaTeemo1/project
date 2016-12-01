public class ScoreApp2{
	public static void main(String[] args){
		//객채 생성 및 홍길동학생의 성적으로 객채가 초기화되었음.
		Score c =new Score();

		//생성된 객체의 필드를 초기화하는 과정을 생략할수있다.

		//바로 기능의 사용이 가능하다.
		int total = c.total();
		double avg = c.avg();

		System.out.println("이름 : "+c.name);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);

	}
}