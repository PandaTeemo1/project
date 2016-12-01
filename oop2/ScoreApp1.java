public class ScoreApp1{
	public static void main(String[] args){
		Score c = new Score();

		c.name = "È«±æµ¿";
		c.kor = 87;
		c.eng = 99;
		c.math = 24;

		int total = c.total();
		double avg = c.avg();

		System.out.println("ÀÌ¸§ : "+c.name);
		System.out.println("ÃÑÁ¡ : "+total);
		System.out.println("Æò±Õ : "+avg);
	}
}