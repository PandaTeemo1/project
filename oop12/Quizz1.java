import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Quizz1{
	public static void main(String[] args)throws ParseException{
		System.out.println("args[0] " + args[0]);
		System.out.println("args[1] " + args[1]);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date day = sdf.parse(args[0]);

		long time = day.getTime();
		long period = (long)Integer.parseInt(args[1]) * 60 * 60 * 24 * 1000;

		day.setTime(time + period);

		System.out.println(args[1]+"일에 해당되는 날 " + sdf.format(day));
	}
	
}