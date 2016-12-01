import java.io.*;

public class ProductApp{
	//상품정보 텍스트 한 줄을 전달받아서
	//값 잘라서 Product에 담아서 반환하는 메소드
	public static Product parseDate(String text){
		Product pp = new Product();
		
		String a[] = text.split(",");
		pp.setName(a[0]);
		pp.setWpwh(a[1]);
		pp.setPrice(Integer.parseInt(a[2]));
		pp.setRate(Double.parseDouble(a[3]));
		return pp;

	}
	public static void main(String[] args)throws FileNotFoundException, IOException{
		Product[] p = new Product[4];
		
		BufferedReader reader = new BufferedReader(new FileReader("product.txt"));
		//String text1 = reader.readLine();
		//String text2 = reader.readLine();
		//String text3 = reader.readLine();
		//String text4 = reader.readLine();
		//Product p1 = parseDate(text1);
		//Product p2 = parseDate(text2);
		//Product p3 = parseDate(text3);
		//Product p4 = parseDate(text4);
		p[0] = parseDate(reader.readLine());
		p[1] = parseDate(reader.readLine());
		p[2] = parseDate(reader.readLine());
		p[3] = parseDate(reader.readLine());

		for(Product ppp : p){
			ppp.info();
		}

	}
}