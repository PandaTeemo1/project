import java.util.StringTokenizer;

public class Quizz5{
	public static void main(String[] args){
		String[] words ={"새끼", "시공의폭풍1", "히어로즈", "순siri", "박ㄹ혜"};
		String text = "모두 함께 시공의폭풍으로 ★★히어로즈 오브 더 스☆톰★★ 가입시$$전원 카드팩<<뒷면100%증정※ 접속시 300골드 $$ 다양한 컨텐츠 $$";

		boolean isContains = false;
	/*	for(int i = 0; i<words.length; i++){
			if(text.contains(words[i])) {
				System.out.println("금칙어 "+words[i]+"가 포함되었습니다");
				break;
			}
			System.out.println(words[i]);
		}*/
		for(String s : words){
			boolean value = text.contains(s);
			if(value) {
				isContains = true;
				System.out.println(value);
			} 
			
		}
	}
}