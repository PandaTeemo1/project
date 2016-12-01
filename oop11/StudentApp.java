import java.io.*;

public class StudentApp{
		public static void main(String[] args)throws FileNotFoundException, IOException{

			BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
			String text = reader.readLine();
			
			String[] a = text.split(",");
			System.out.println(text);

	}	 
}