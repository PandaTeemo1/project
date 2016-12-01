import java.util.Scanner;

public class ContactApp{
	public static void main(String[] args){
		//연락처 정보를 입력받는 화면 관련 클래스
		//사용자의 입력을 읽어오는 Scanner 객체 생성하기
		Scanner s = new Scanner(System.in);
		
		
		Contact[] contact = new Contact[100];
		int currentPosition = 0;
		
		for(;;){
			System.out.println("1:등록   2:조회   3:종료");
			System.out.print("메뉴 번호를 입력하세요 : ");
			int menunum = s.nextInt();
			if(menunum == 1){
				System.out.print("번호 : ");
				int no = s.nextInt();
				System.out.print("이름 : ");
				String name = s.next();
				System.out.print("전화번호  : ");
				String number = s.next();
				System.out.print("이메일 : ");
				String email = s.next();
				//Contact객체 생성하고, 값을 담기
				Contact contacts = new Contact();
				contacts.setNo(no);
				contacts.setName(name);
				contacts.setNumber(number);
				contacts.setEmail(email);
				//배열에 저장하기

				//mgr.addContact(contact);
				contacts[currentPosition] = contact;
				currentPosition++;
				
				//배열에 등록하기
				 //currentPosition이 가르키는 위치에 Contact를 저장하고
				// currentPosition의 값을 1증가시킨다.
				// mgr이 addContact(Contact contact) 메소드에 등록할 contact객채 전달
				
			} else if(menunum == 2){
				//mgr.displayContact();
				for(int i=0; i<currentPosition; i++){
					contact c = contact[i];
					System.out.printf("%d %s %s %s\n", c.getNo(), c.getName(), c.getNumber(), c.getEmail());
				}
			}else if(menunum == 3){
				break;
			}
				//배열에 등록된 모든 연락처 정보 표시하기
				//<-- 널값이 나올때까지 포문 널이면 break 빠져나오기
				//배열에서 0부터 currentPosition이 가르키는 위치 앞까지 반복하기
				//mgr이 displayContact()를 실행시키기.
			
			
		}

	}
}