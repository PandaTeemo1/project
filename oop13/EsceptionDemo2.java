import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class ExceptionDemo2{
	public static void main(String[] args){
		try{
			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
		} catch(FileNotFoundException fnfe){
			//���� ó�� �ڵ� �ۼ�
			//1. ����� ģȭ���� ���� �޼����� ǥ���Ѵ�.
			System.out.println("������ ã�� �� �����ϴ�. ��� �� ���ϸ��� Ȯ���ϼ���");
		}
	}
}