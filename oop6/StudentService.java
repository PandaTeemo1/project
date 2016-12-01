/*
	StudentService는 학생정보를 저장/조회/삭제/변경하는 기능을 제공하는 클래스다.
*/
//

public class StudentService{
	private Student[] db = new Student[5];

	
	public StudentService() {
		db[0] = new Student(29, 3, "홍길동", "3020304030203");
		db[1] = new Student(28, 4, "도우너", "4020304030203");
		db[2] = new Student(27, 5, "마이콜", "5020304030203");
		db[3] = new Student(26, 3, "김또치", "6020304030203");
		db[4] = new Student(25, 5, "김둘리", "7020304030203");
	}
	
	//학번을 전달받아서 그 학번에 해당하는 학생정보를 반환하는 메소드
	public Student getStudentByNo(int no){
		Student result = null;
		for(Student s : db){
			if(s.getNo()==no){
				result = s;
				//System.out.printf("%d %d %s %s\n", s.getNo(), s.getGrade(), s.getName(), s.getPhone());
			}
		}
		

		return result;
	}
	//학년을 전달받아서 그 학년에 해당하는 학생정보를 반환하는 메소드
	public Student[] getStudentByGrade(int grade){
		Student[] result = null;

		Student[] temp = new Student[db.length];
		int position = 0;
		for(Student s : db){
			if(s.getGrade() == grade){

				temp[position] = s;
				//System.out.printf("%d %d %s %s\n", db[i].getNo(), db[i].getGrade(), db[i].getName(), db[i].getPhone());
				position++;
			}
		}
		result = new Student[position];
		for(int i =0; i<position; i++){
			result[i] = temp[i];		
		}
		

		return result;
	}
	//학생정보를 전달받아서 그 학번에 해당하는 학생정보를 변경하는 메소드
	//
	public void change(Student student) {
		for(int i = 0; i<db.length; i++){
			Student s = db[i];
			if(s.getNo() == student.getNo()){
				db[i] = student;
			}
		}
	} 

}