import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo1{
	public static void main(String[] args){
		//SimpleDateFormat
			//Date -> text : Date객체의 날짜/시간정보를 지정된 패턴의 텍스트로 변환한다.
			//text -> Date : 지정된 패턴으로 작성된 날짜/시간정보를 담고 있는 텍스트를 Date객체로 반환한다.

			Date now = new Date();
		
			String pattern = "a h시 m분 s초";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			
			String text = sdf.format(now);
			System.out.println(text);
	}
}