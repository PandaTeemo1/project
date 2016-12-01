public class ArrayDemo4 {
	public static void main(String[] args) {
		/*
		String[][] groups = new String[2][3];
		
		// 다차원 배열에 값 저장하기
		groups[0][0] = "황진수";
		groups[0][1] = "진희남";
		groups[0][2] = "장해영";
		groups[1][0] = "홍승환";
		groups[1][1] = "윤용학";
		groups[1][2] = "이형준";
		*/
		String[][] groups = {{"황진수", "진희남", "장해영"}, {"홍승환", "윤용학", "이형준"}};

		// 다차원 배열의 값 표시하기
		/*
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.printf("(%d, %d) => %s", i, j, groups[i][j] + "\t");
			}
			System.out.println();
		}
		*/
		for (String[] group : groups) {
			for (String name : group) {
				System.out.print(name + "\t");
			}
			System.out.println();
		}
	}
}