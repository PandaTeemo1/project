import java.util.Date;
import java.util.Calendar;

public class CalendarDemo1{
	public static void main(String[] args){
		Calendar now = Calendar.getInstance();
		System.out.println(now);

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);

		System.out.println(year + " " + month + " " + day);
	}
}