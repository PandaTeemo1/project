import java.util.Scanner;

public class ForDemo7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int total = 0;
		for(;;){
			
			System.out.println();
			System.out.println("[1]�Ա�	[2]���	[3]��ȸ	[0]����");
			System.out.print("�޴��� �����ϼ���:");
			int menuNo =sc.nextInt();
		
			if(menuNo == 1){
				System.out.print("���ݾ� : ");
				int money = sc.nextInt();
				total = total + money;
				System.out.println(total+"���� �ԱݵǾ����ϴ�");
			} else if(menuNo==2){
				System.out.print("��ݾ� : ");
				int money = sc.nextInt();
					if(total >= money){
						total = total - money;
						System.out.println(money+"���� ��ݵǾ����ϴ�");
					}else{
						System.out.println("�ܾ��� �����մϴ�");
						break;
					}	
				} else if(menuNo==3){
				System.out.println("�ܰ� "+total+"���ֽ��ϴ�");
			} else if(menuNo==0){
				System.out.println("�����մϴ�");
				break;
			}
		}
	}
}