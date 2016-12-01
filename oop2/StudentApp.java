public class StudentApp{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student(20161115, "고길동", 88, 77, 95);

		s1.no = 20092083;
		s1.name = "홍길동";
		s1.kor = 88;
		s1.eng = 40;
		s1.math = 55;
		int total1 = s1.total();
		double avg1 = s1.avg();
		System.out.println("총점 : "+total1+"점 입니다");
		System.out.println("평균 : "+avg1+"점 입니다");
		s1.info();
		s2.info();





		
	}
}