//score.txt 파일을 읽어서 성적정보를 읽어서 화면에 출력하는 프로그램
	//1. 학생정보를 담는 Student 클래스 정의하기
	//2. StudentApp 정의하기
	//FileReader와 BufferedReader를 사용해서 파일의 내용 읽어오기
	//읽어온 내용을 ,를 기준으로 자르기
	//잘라낸 내용을 Student 객체를 생성해서 저장하기
	//Student객체에 저장된 내용을 화면에 표시하기
import java.text.DecimalFormat;
public class Student {
	private String name;
	private String grade;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	public Student(){
	}
	public Student(String name, String grade, int kor, int eng, int math, int total, double avg){
		this.name = name;
		this.grade =grade;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.total = total;
		this.avg = avg;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getGrade(){
		return grade;
	}
	public void setGrade(String grade){
		this.grade = grade;
	}
	public int getKor(){
		return kor;
	}
	public void setKor(int kor){
		this.kor = kor;
	}
	public int getEng(){
		return eng;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	public int getMath(){
		return math;
	}
	public void setMath(int math){
		this.math = math;
	}
	public int getTotal(){
		return kor + eng + math;
	}
	public double getAvg(){
		return getTotal()/3.0;
	}
	public void setAvg(double avg){
		this.avg = avg;
	}
	String pattern1 = "#.00";
	DecimalFormat df1 = new DecimalFormat(pattern1);
	public void info(){
		System.out.printf("%s %s  %d  %4d  %4d  %4d   %4s\n",getName(), getGrade(), getKor(), getEng(), getMath(), getTotal(), df1.format(getAvg()));
	}
}