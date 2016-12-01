import java.util.Scanner;

public class ContactApp2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Contact c = new Contact();
		Tel p = new Tel();
		Address a = new Address();

		for(;;){
			System.out.println("1.이름 등록	2.전화 등록	3.주소 등록	4.조회 5.종료");
			System.out.print("메뉴를 선택하세요 :");
			int num = sc.nextInt();
				
			if(num == 1){
				//이름을 입력받아서 Contact에 저장합니다.
				System.out.print("이름을 입력하시오");
				String name = sc.next();
				c.setName(name);
			}else if(num == 2){

				// 전화번호를 입력받아서 Contact에 저장합니다.
				// Tel객체 생성 -> 값 입력받아서 채우고 -> Contact의 addTel(Tel tel)
				// 에게 Tel 객체 생성해서 배열에 담기
				System.out.print("블라블라 입력해 : ");
				String blah1 = sc.next();
				System.out.print("숫자또 입력해 : ");
				String blah2 = sc.next();
				p.setType(blah1);
				p.setNumber(blah2);
				c.addTel(p);


	
			}else if(num == 3){
				// 주소를 입력받아서 Contact에 저장합니다.
				//address객체 생성 -> 값 입력받아서 채우고 -> Contact의 setter 이용해서 저장
				//기존에 있으면 덮어 씌우기
				System.out.print("시도를 입력하시오 : ");
				String blah3 = sc.next();
				System.out.print("구군을 입력하시오 : ");
				String blah4 = sc.next();
				System.out.print("집을 입력하시오 : ");
				String blah5 = sc.next();
				System.out.print("자세히 입력하시오 : ");
				String blah6 = sc.next();
				a.setSido(blah3);
				a.setGugun(blah4);
				a.setDetail(blah5);
				a.setZipcode(blah6);

				c.setAddress(a);
			}else if(num == 4){
				//연락처 정보를 화면에 표시합니다.
				c.displayContact();

			}else if(num == 5){
				break;
			}
		}
	}
}

/*
	Database를 대상으로 하는 작업
	Create - 새 데이터 저장
	Retrieve - 데이터 조회
	Update - 데이터 수정
	Delete - 데이터 삭제

*/