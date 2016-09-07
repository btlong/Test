package test;

public class test {

	public static void main(String[] args) {

		int down = 5;
		int up = 1;
		
		for (int i = 1; i <= 5; i++) {
			if (i >= 4) { // 4번째부터
				down -= 2;
			}
			// 3번째 줄 이하 up 이외 down
			System.out.println(i <= 3 ? up : down);
			up += 2;

		}
	}

}
