
import java.io.*;

public class Exceptiondemo3{

	//reading()�� �ڽ��� ����ϴ� ���๮���� �߻��ϴ� ���ܸ� ó������ �ʴ´�.
	//��� �߻��� ����Ǵ� ���ܸ� �ٽ� ����������.

	public static void reading()throws FileNotFoundException, IOException{

			//FileNotFoundException�� ������ ������
			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
			//IOException�� ������ �޼ҵ�
			String text = reader.readLine();
			System.out.println("���� : "+text);

	}	
	//main()�޼ҵ�� reading()�޼ҵ尡 ������ ���ܿ� ���� ó���� ���� �ϰ��ִ�.
	//reading()�޼ҵ�� �ڽ��� ����ϴ� main()���� ����ó�� å���� ���Ѱ��.

	public static void main(String[] args){
		try{
			Exceptiondemo3.reading();
		} catch(FileNotFoundException a1){
			System.out.println("������ ã���� ����");
		} catch(IOException a2){
			System.out.println("������ �д� �� ������ �߻��޽��ϴ�");
		}
	}
}