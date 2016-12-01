import java.util.Date;

public class PostingApp{
	public static void main(String[] args){
		Posting p = new Posting(1, "관리자", "크리스마스 시즌 이벤트", new Date());
		
		System.out.println("글번호 : " + p.getNo());
		System.out.println("글제목 : " + p.getTitle());
		System.out.println("글내용 : " + p.getText());
		System.out.println("작성일 : " + p.getPrettyRegdate());

		/*
		Date d1 = p.getRegdate();
		System.out.println(d1);
		String d2 =p.getPrettyRegdate();
		System.out.println(d2);
		*/
	}
}