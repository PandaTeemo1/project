import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class ExceptionDemo2{
	public static void main(String[] args){
		try{
			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
		} catch(FileNotFoundException fnfe){
			//예외 처리 코드 작성
			//1. 사용자 친화적인 에러 메세지를 표시한다.
			System.out.println("파일을 찾을 수 없습니다. 경로 및 파일명을 확인하세요");
		}
	}
}