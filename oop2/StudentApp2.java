public class StudentApp2{
	public static void main(String[] args){
		//�л����� ���� �� �����ϴ� �迭 �����
		//Student��ü 5�� ���� �� �ִ� �迭�� �����ؼ� students ������ ��Ҵ�.
		Student[] students = new Student[5];
		
		students[0] = new Student(1, "�̸�", 40, 50, 60);
		students[1] = new Student(2, "�Ƹ�", 50, 50, 60);
		students[2] = new Student(3, "����", 60, 50, 60);
		students[3] = new Student(4, "����", 70, 50, 60);
		students[4] = new Student(5, "����", 80, 50, 60);


		System.out.println("��ȣ �̸� ���� ���� ���� ���� ���");
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