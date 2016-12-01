public class Student{

	int no; //학번
	String name; //이름
	int kor; // 국어
	int eng; // 영어
	int math; // 수학

	//기본 생성자
	public Student(){
	
	}
	//모든 필드를 초기화하는 생성자 -> 매개변수 5개짜리 생성자
	public Student(int a, String b, int c, int d, int e){
		no =a;
		name =b;
		kor=c;
		eng=d;
		math=e;

	}
	//총점을 반환하는 기능
	public int total(){
		int value = kor + eng + math; 
		return value;

	}
	//평균을 반환하는 기능
	public double avg(){
		double value = total()/3.0;
		return value;


	}
	// 학생 정보를 출력하는 기능(총점과 평균도 포함)
	public void info(){
		System.out.println("##### 학생정보 #####");
		System.out.println("학번 : "+no);
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+total());
		System.out.println("평균 : "+avg());
		System.out.println("####################");
	}
}