import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo2{
	public static void main(String[] args){
		try{
			//FileNotFoundException�� ������ ������
			BufferedReader reader = new BufferedReader(new FileReader("me1mo.txt"));

			//IOException�� ������ �޼ҵ�
			String text = reader.readLine();
			System.out.println("���� ���� : " +text);
		} catch(FileNotFoundException fnfe){

			System.out.println("���ܹ߻�!!!!");
			System.out.println("���ܰ�ü:" + fnfe);
			fnfe.printStackTrace();//������ ������ �� �ִ� ������ ȭ�鿡 ���
			//���� ó�� �ڵ� �ۼ�
			//1. ����� ģȭ���� ���� �޼����� ǥ���Ѵ�.
			System.out.println("������ ã�� �� �����ϴ�. ��� �� ���ϸ��� Ȯ���ϼ���");
		} catch(IOException ioe){
			System.out.println("������ �о���� ���� ������ �߻��Ͽ����ϴ�. ���ӻ��¸� Ȯ���ϼ���");
		}
	}
}