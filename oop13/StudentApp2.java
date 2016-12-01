import java.io.*;
import java.text.DecimalFormat;

public class StudentApp2{
	public static Student parseDate(String text){
		Student pp = new Student();
		
		String a[] = text.split(",");
		pp.setName(a[0]);
		pp.setGrade(a[1]);
		pp.setKor(Integer.parseInt(a[2]));
		pp.setEng(Integer.parseInt(a[3]));
		pp.setMath(Integer.parseInt(a[4]));

		return pp;

	}
	public static void main(String[] args)throws FileNotFoundException, IOException{
		Student[] p = new Student[10];
		
		BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
		p[0] = parseDate(reader.readLine());
		p[1] = parseDate(reader.readLine());
		p[2] = parseDate(reader.readLine());
		p[3] = parseDate(reader.readLine());
		p[4] = parseDate(reader.readLine());
		p[5] = parseDate(reader.readLine());
		p[6] = parseDate(reader.readLine());
		p[7] = parseDate(reader.readLine());
		p[8] = parseDate(reader.readLine());
		p[9] = parseDate(reader.readLine());
	System.out.println("이름   학년  국어  영어  수학  총점  평균");
	for(Student s : p){
		s.info();
	}
	}
}