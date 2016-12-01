import java.io.FileReader;
import java.io.BufferedReader;

public class ExceptionDemo1{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
	}
}