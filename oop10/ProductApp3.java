import java.util.Arrays;

public class ProductApp3{
	public static void main(String[] args){

		Product[] cart = new Product[5];
		cart[0] = new Product("����", 2000);
		cart[1] = new Product("����", 16000);
		cart[2] = new Product("�ݶ�", 6000);
		cart[3] = new Product("���̴�", 20000);
		cart[4] = new Product("���찳", 30000);
		
		System.out.println(Arrays.toString(cart));
	}
}