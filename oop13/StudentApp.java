import java.io.*;

public class StudentApp{
		public static void main(String[] args)throws FileNotFoundException, IOException{

			Student s = new Student();
			
			BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
			String text = reader.readLine();
			
			String[] a = text.split(",");

			s.setName(a[0]);
			s.setGrade(a[1]);
			s.setKor(Integer.parseInt(a[2]));
			s.setEng(Integer.parseInt(a[3]));
			s.setMath(Integer.parseInt(a[4]));
			s.info();
			String s1 = String.valueOf(3);
			System.out.println(s1);
			

	}	 
}