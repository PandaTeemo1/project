import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateFormatDemo2{
	public static void main(String[] args)throws ParseException{
		
		String pattern = "yyyy/MM/dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		//저장된 형식의 텍스트를 date객체로 변환하기
		String text = "2016/11/29";

		Date date = sdf.parse(text);

		System.out.println(date);


	}
}