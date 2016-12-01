import java.util.Random;

public class Quizz1{
	public static void main(String[] args){
		Random rc = new Random();
		int[] intArray = new int[5];
		

		int[] scores = new int[5];
		scores[0] = rc.nextInt(100);
		scores[1] = rc.nextInt(100);
		scores[2] = rc.nextInt(100);
		scores[3] = rc.nextInt(100);
		scores[4] = rc.nextInt(100);

		for(int i =0; i < scores.length; i++){
			System.out.println(scores[i]);


		}
	}
}
