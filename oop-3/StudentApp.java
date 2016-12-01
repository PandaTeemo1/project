import java.util.Scanner;

public class StudentApp{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		//학생정보(번호,이름,국어,영어,수학 점수)입력받아서 
		//Student객체에 저장하기
		Student student = new Student();

		System.out.print("번호를 입력하세요 : ");
		int no = s.nextInt();
		student.setNo(no);
		System.out.print("이름을 입력하세요 : ");
		String name = s.next();
		student.setName(name);
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = s.nextInt();
		student.setKor(kor);
		System.out.print("영어 점수를 입력하세요 : ");
		student.setEng(s.nextInt());
		System.out.print("수학 점수를 입력하세요 : ");
		int math = s.nextInt();
		student.setMath(math);

		System.out.println("번호 : "+ student.getNo() );
		System.out.println("이름 : "+name );
		System.out.println("국어 : "+kor );
		System.out.println("영어 : "+student.getEng() );
		System.out.println("수학 : "+math );
		System.out.println("총점 : "+student.getTotal() );
		System.out.println("평균 : "+student.getAverage() );
	}
}