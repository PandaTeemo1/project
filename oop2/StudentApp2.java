public class StudentApp2{
	public static void main(String[] args){
		//학생들을 여러 명 저장하는 배열 만들기
		//Student객체 5개 담을 수 있는 배열을 생성해서 students 변수에 담았다.
		Student[] students = new Student[5];
		
		students[0] = new Student(1, "이름", 40, 50, 60);
		students[1] = new Student(2, "아름", 50, 50, 60);
		students[2] = new Student(3, "오름", 60, 50, 60);
		students[3] = new Student(4, "구름", 70, 50, 60);
		students[4] = new Student(5, "으름", 80, 50, 60);


		System.out.println("번호 이름 국어 영어 수학 총점 평균");
		for(Student s : students){
			System.out.printf("%d, %s, %4d, %4d, %4d, %4d, %2.2f\n", s.no, s.name, s.kor, s.eng, s.math, s.total(), s.avg());
			//System.out.println(s.avg());
		}
		
		/*for(int i=0; i<=students.length; i++){
			Student s = students[i];
			s.info();
		}*/
		
		/*students[0].info();
		students[1].info();
		students[2].info();
		students[3].info();
		students[4].info();*/
	}
}