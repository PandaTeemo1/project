public class StudentApp{
	public static void main(String[] args){
		StudentService service = new StudentService();

		Student student1 = service.getStudentByNo(25);
		Student[] student2 = service.getStudentByGrade(5);

		Student student3 = new Student(28, 5, "µµ¿ì³Ê", "8020304030203");
		service.change(student3);
	}
}