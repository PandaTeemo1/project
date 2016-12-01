import java.io.*;

public class ExceptionDemo5{

	public static void writing(){ 
		try{
			FileWriter writer = new FileWriter("sample.txt");
			String text = "12�� 3�� ������ ����� �ܼ�Ʈ";
		
			writer.write(text);
			writer.flush();
		}catch(FileNotFoundException a1){
			throw new  L2Exception();
		}catch(IOException a2){
			throw new  L2Exception();
		}
	}
	public static void reading(){
			try{
				BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
				String text = reader.readLine();
				System.out.println("���� : "+text);
			}catch(FileNotFoundException a1){
				// FileNotFoundException�� �߻��� ���� ����ä��, ��� HtaException�� �����ؼ� ������
				throw new  L2Exception();
			}catch(IOException a2){
				throw new  L2Exception();
			}
	}
	public static void main(String[] args){
			ExceptionDemo5.reading();
			ExceptionDemo5.writing();
	
	}
		
	
}