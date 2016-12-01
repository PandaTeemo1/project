import java.util.*;

public class SystemDemo{
	public static void main(String[] args){
		//현재시간 알아내기 1/1000초 
		long time = System.currentTimeMillis();
		System.out.println(time);

		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);

		String value1 = System.getenv("JAVA_HOME");
		System.out.println(value1);

		String value2 = System.getenv("PATH");
		System.out.println(value2);

		//시스템의 프로세서값 조회하기
		String newLineChar = System.getProperty("line.separator");
		System.out.println("adf"+newLineChar+"asdf");

		//현재 시스템의 사욪아 홈 디렉토리 조회하기
		String dir = System.getProperty("user.home");
		System.out.println(dir);

		//프로그램 종료
		//System.exit(0);

		//배열 복사하기
		String[] names ={"이", "김", "김", "홍", "일", "임"}; 
		String[] dest = new String[10];
		//name = 원본 배열
		//namesPosition : 원본 배열에서 복사할 학목의 시작 위치
		//dust : 복사 배열
		//dustPosition : 복사 배열에서 복사할 항목을 붙여넣을 시작 위치
		//length : 원본 배열에서 복사할 항복의 갯수

		//배열 복사하기
		System.arraycopy(names, 0, dest, 0, 6);

		System.out.println(Arrays.toString(dest));
		
	}
}

