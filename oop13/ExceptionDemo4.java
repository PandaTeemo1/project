import java.io.*;

public class ExceptionDemo4{

	public static void writing() throws HtaException{
		try{
			FileWriter writer = new FileWriter("sample.txt");
			String text = "12�� 3�� ������ ����� �ܼ�Ʈ";
		
			writer.write(text);
			writer.flush();
		}catch(FileNotFoundException a1){
			throw new HtaException();
		}catch(IOException a2){
			throw new HtaException();
		}
	}
	public static void reading() throws HtaException{
			try{
				BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
				String text = reader.readLine();
				System.out.println("���� : "+text);
			}catch(FileNotFoundException a1){
				// FileNotFoundException�� �߻��� ���� ����ä��, ��� HtaException�� �����ؼ� ������
				throw new HtaException();
			}catch(IOException a2){
				throw new HtaException();
			}
	}
	public static void main(String[] args){
		try{
			ExceptionDemo4.reading();
			ExceptionDemo4.writing();
		} catch(HtaException h){
			System.out.println("���α׷� ���� �� ������ �߻��߽��ϴ�");
		}
	}
}