package Major;

import java.util.ArrayList;

public class Course {
	private int no;
	private String name;
	private int limit;
	private ArrayList<Student> student;
	private Professor professor;
	
	public Course(){}

	public Course(int no, String name, int limit, ArrayList<Student> student, Professor professor) {
		super();
		this.no = no;
		this.name = name;
		this.limit = limit;
		this.student = student;
		this.professor = professor;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public ArrayList<Student> getStudent() {
		return student;
	}

	public void setStudent(ArrayList<Student> student) {
		this.student = student;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public void info(){
		System.out.println("------------------------------------");
		System.out.printf("%d %s %d\n",no, name, limit);
	}
	public void sinfo(){
		System.out.println("학번   이름   전공");
		System.out.println("-----------------------------------------------------------------");
		for(Student s : student){
			System.out.printf("%d    %s     %s\n",s.getNo(),s.getName(),s.getDepart());
		}
		
	}
	
}
