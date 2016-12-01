/*
	StudentService�� �л������� ����/��ȸ/����/�����ϴ� ����� �����ϴ� Ŭ������.
*/
//

public class StudentService{
	private Student[] db = new Student[5];

	
	public StudentService() {
		db[0] = new Student(29, 3, "ȫ�浿", "3020304030203");
		db[1] = new Student(28, 4, "�����", "4020304030203");
		db[2] = new Student(27, 5, "������", "5020304030203");
		db[3] = new Student(26, 3, "���ġ", "6020304030203");
		db[4] = new Student(25, 5, "��Ѹ�", "7020304030203");
	}
	
	//�й��� ���޹޾Ƽ� �� �й��� �ش��ϴ� �л������� ��ȯ�ϴ� �޼ҵ�
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
	//�г��� ���޹޾Ƽ� �� �г⿡ �ش��ϴ� �л������� ��ȯ�ϴ� �޼ҵ�
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
	//�л������� ���޹޾Ƽ� �� �й��� �ش��ϴ� �л������� �����ϴ� �޼ҵ�
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