public class ContactMgr{
	private Contact[] contacts = new Contact[100];
	private int currentPosition = 0;

	// Contact 객채를 전달받아서 배열에 저장하기
	public void addContact(Contact contact) {
		contacts[currentPosition] = contact;
		currentPosition++;
	}
	//contacts 배열에 저장된 모든 연락처 정보 표시하기
	public void displayContact(){
		for(int i = 0; i<currentPosition; i++){
			contact c = contacts[i];

			System.out.println("%d %s %s %s\n", c.getNo(), c.getName(), c.getNumber(), c.getEmail());
		}
	}
}
