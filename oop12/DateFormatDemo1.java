import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo1{
	public static void main(String[] args){
		//SimpleDateFormat
			//Date -> text : Date��ü�� ��¥/�ð������� ������ ������ �ؽ�Ʈ�� ��ȯ�Ѵ�.
			//text -> Date : ������ �������� �ۼ��� ��¥/�ð������� ��� �ִ� �ؽ�Ʈ�� Date��ü�� ��ȯ�Ѵ�.

			Date now = new Date();
		
			String pattern = "a h�� m�� s��";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			
			String text = sdf.format(now);
			System.out.println(text);
	}
}