import java.io.*;

public class ExceptionDemo4{

	public static void writing() throws HtaException{
		try{
			FileWriter writer = new FileWriter("sample.txt");
			String text = "12월 3일 볼빨간 사춘기 콘서트";
		
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
				System.out.println("내용 : "+text);
			}catch(FileNotFoundException a1){
				// FileNotFoundException이 발생한 것을 가로채고, 대신 HtaException을 생성해서 던지기
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
			System.out.println("프로그램 실행 중 오류가 발생했습니다");
		}
	}
}