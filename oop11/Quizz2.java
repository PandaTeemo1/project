

public class Quizz2{
	public static void main(String[] args){
		String text = "<fejifejifeji@naver.com>,<qddqdqf@hanmail.com>,<park@gmail.com>,<hanzo@overwatch.com>";
		/*String[] str1 = text.split(",");
		for(String s : str1){
			System.out.println(s.substring(1,s.length()-1));
		
		}
	*/
		String[] emails = text.split(",");
		for(String mail : emails){
			int beginIndex = mail.indexOf("<");
			int endIndex = mail.indexOf(">");

			mail = mail.substring(beginIndex+1, endIndex);
			System.out.println(mail);
		}
		for(String mail : emails){
			mail = mail.replace("<", "").replace(">", "");
			System.out.println(mail);
		}
	}
}