package file.read;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ScoreApp {
	public static void main(String[] args) throws Exception {
		ArrayList<Score> scl = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("score.txt");
		FileOutputStream fos2 = new FileOutputStream("ranking.txt");
		//1.성적 정보 등록 2. 성적정보 파일로 저장 0.종료
		while(true){
			Score scores = new Score();
			System.out.println("1.성적정보 등록 2.성적정보 파일로 저장 3.성적순정렬해서 파일저장 0.종료");
			System.out.print("선택 : ");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1){
				System.out.print("이름을 입력하세요 : ");
				String name = sc.nextLine();
				scores.setName(name);
				System.out.print("국어점수를 입력하세요 : ");
				int kor = Integer.parseInt(sc.nextLine());
				scores.setKor(kor);
				System.out.print("영어점수를 입력하세요 : ");
				int eng = Integer.parseInt(sc.nextLine());
				scores.setEng(eng);
				System.out.print("수학점수를 입력하세요 : ");
				int math = Integer.parseInt(sc.nextLine());
				scores.setMath(math);
				scl.add(scores);
			}else if(menu == 2){
				for(Score n : scl){
					String text = n.toString();
					text = text + System.lineSeparator();
					byte[] bytes=text.getBytes();
					fos.write(bytes);
				}
					fos.close();
			}else if(menu == 0){
				/*Collections.sort(scl, new Comparator<Score>(){
					public int compare(Score f1, Score f2){
						return f2.getTotal() - f1.getTotal();
					}
				});*/
				Collections.sort(scl, (f1, f2)->f2.getTotal()-f1.getTotal());
				for(Score n : scl){
					String text = n.toString();
					text = text + System.lineSeparator();
					byte[] bytes=text.getBytes();
					fos2.write(bytes);
				}
					fos2.close();
			}
		}
	}
}
