public class ContactMgr{
	private Contact[] contacts = new Contact[100];
	private int currentPosition = 0;

	// Contact ��ä�� ���޹޾Ƽ� �迭�� �����ϱ�
	public void addContact(Contact contact) {
		contacts[currentPosition] = contact;
		currentPosition++;
	}
	//contacts �迭�� ����� ��� ����ó ���� ǥ���ϱ�
	public void displayContact(){
		for(int i = 0; i<currentPosition; i++){
			contact c = contacts[i];

			System.out.println("%d %s %s %s\n", c.getNo(), c.getName(), c.getNumber(), c.getEmail());
		}
	}
}
