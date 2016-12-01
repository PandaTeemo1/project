public class ArrayApp{
	public static void main(String[] args){
		int b[] = new int[10];
		ArrayService a = new ArrayService();
		b=a.move(3);
		for(int i = 0; i<b.length; i++){
			System.out.print(b[i]);
			System.out.println();
		}
	}
}