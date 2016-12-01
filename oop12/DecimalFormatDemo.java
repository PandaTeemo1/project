import java.text.DecimalFormat;

public class DecimalFormatDemo{
	public static void main(String[] args){
		int number = 123456789;

		String pattern = "#.##";
		DecimalFormat df = new DecimalFormat(pattern);
		String text = df.format(number);

		System.out.println(text);

		double rate =1112.345;

		String pattern1 = "#,###.####";
		DecimalFormat df1 = new DecimalFormat(pattern1);
		String text1 = df1.format(rate);
		System.out.println(text1);
	}
}