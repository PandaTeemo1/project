import java.util.Arrays;

public class ProductApp3{
	public static void main(String[] args){

		Product[] cart = new Product[5];
		cart[0] = new Product("볼펜", 2000);
		cart[1] = new Product("액자", 16000);
		cart[2] = new Product("콜라", 6000);
		cart[3] = new Product("사이다", 20000);
		cart[4] = new Product("지우개", 30000);
		
		System.out.println(Arrays.toString(cart));
	}
}